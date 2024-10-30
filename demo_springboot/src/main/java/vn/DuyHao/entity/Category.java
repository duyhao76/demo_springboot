package vn.DuyHao.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private Long id;
	
	@Column(name = "categoryname", columnDefinition = "NVARCHAR(50)")
	@NotEmpty(message = "Không được rỗng")
	private String name;
	
	@Column(name = "image", columnDefinition = "NVARCHAR(500)")
	private String image;
	
	private int Status;
	
}
