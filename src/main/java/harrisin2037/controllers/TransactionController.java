package harrisin2037.controllers;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import harrisin2037.models.Transaction;
import harrisin2037.services.TransactionService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {

  @Autowired
  TransactionService srv;

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @PostMapping(value = "/")
  public String create(@RequestBody Transaction transaction) {
    logger.debug("Saving transaction");
    srv.createTransaction(transaction);
    return "transaction record created.";
  }

	@GetMapping(value= "/")
	public Collection<Transaction> getAll() {
		logger.debug("get all transaction.");
		return srv.getAllTransactions();
	}

  @GetMapping(value= "/{trans_id}")
	public Optional<Transaction> getById(@PathVariable(value= "trans_id") int id) {
		logger.debug("get transaction record with trans_id= {}.", id);
		return srv.findTransactionById(id);
	}

  @PutMapping(value= "/update/{trans_id}")
	public String update(@PathVariable(value= "trans_id") int id, @RequestBody Transaction transaction) {
		logger.debug("Updating transaction with trans_id = {}.", id);
		transaction.setId(id);
		srv.updateTransaction(transaction);
		return "transaction record for trans_id = " + id + " updated.";
	}

  @DeleteMapping(value= "/delete/{trans_id}")
	public String delete(@PathVariable(value= "trans_id") int id) {
		logger.debug("delete with trans_id = {}.", id);
		srv.deleteTransactionById(id);
		return "delete record trans_id = " + id + ".";
	}

}
