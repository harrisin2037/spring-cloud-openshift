package harrisin2037.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import harrisin2037.models.Transaction;

@Repository
public interface TransactionDao extends MongoRepository<Transaction, Integer> {
}
