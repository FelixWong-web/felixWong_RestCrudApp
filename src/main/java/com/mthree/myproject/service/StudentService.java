package com.mthree.myproject.service;

import com.mthree.myproject.entity.Student;
import com.mthree.myproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class ProductService {
//    private ProductRepository productRepository;
//
//    public ProductService(ProductRepository productRepository)
//    {
//        this.productRepository = productRepository;
//    }
//
//    public List<Product> getAllProducts()
//    {
//        return productRepository.findAll();
//    }
//    public Product getProductById(Long id)
//    {
//        return productRepository.findById(id).orElse(null);
//    }
//    public  Product addProduct(Product product)
//    {
//        return productRepository.save(product);
//    }
//    public  void deleteProduct(Long id)
//    {
//        productRepository.deleteById(id);
//    }
//    public  Product updateProduct(Long id, Product updatedProduct)
//    {
//        Product prod = productRepository.findById(id).orElse(null);
//        if(prod !=null)
//        {
//            prod.setName(updatedProduct.getName());
//            prod.setPrice(updatedProduct.getPrice());
//            return productRepository.save(prod);
//        }
//        return null;
//    }
//
//}
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {

        Student existing = studentRepository.findById(id).orElseThrow();

        existing.setName(student.getName());
        existing.setFees(student.getFees());
        existing.setSubName(student.getSubName());

        return studentRepository.save(existing);
    }
}