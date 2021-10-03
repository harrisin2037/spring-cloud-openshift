package harrisin2037.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import harrisin2037.daos.TransactionDao;
import harrisin2037.models.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

  @Autowired
  TransactionDao dao;

  @Override
  public void createTransaction(Transaction tran) {
    dao.save(tran);
  }

  @Override
  public Collection<Transaction> getAllTransactions() {
    return dao.findAll();
  }

  @Override
  public Optional<Transaction> findTransactionById(int id) {
    return dao.findById(id);
  }

  @Override
  public void deleteTransactionById(int id) {
    dao.deleteById(id);
  }

  @Override
  public void updateTransaction(Transaction tran) {
    dao.save(tran);
  }

  @Override
  public void deleteAllTransactions() {
    dao.deleteAll();
  }
}