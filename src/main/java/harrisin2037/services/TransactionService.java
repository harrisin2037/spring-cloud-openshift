package harrisin2037.services;

import java.util.Collection;
import java.util.Optional;

import harrisin2037.models.Transaction;

public interface TransactionService {
  	/**
	 * Method to create new transactions in the db using mongo-db repository.
	 * @param trans
	 */
	public void createTransaction(Transaction trans);

	/**
	 * Method to fetch all transactions from the db using mongo-db repository.
	 * @return
	 */
	public Collection<Transaction> getAllTransactions();

	/**
	 * Method to fetch transaction by id using mongo-db repository.
	 * @param id
	 * @return
	 */
	public Optional<Transaction> findTransactionById(int id);

	/**
	 * Method to delete transaction by id using mongo-db repository.
	 * @param id
	 */
	public void deleteTransactionById(int id);

	/**
	 * Method to update transaction by id using mongo-db repository.
	 * @param id
	 */
	public void updateTransaction(Transaction trans);

	/**
	 * Method to delete all transactions using mongo-db repository.
	 */
	public void deleteAllTransactions();
}