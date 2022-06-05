//package io.agileintelligece.ppmtool.domain;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//public class Backlog {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  Long id;
//    private  Integer PTSequence = 0;
//    private  String projectIdentifier;
//
//    // OneToOne with project
//
//    // OneToMany projectTasks
//    public Backlog() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getPTSequence(Integer PTSequence) {
//        return PTSequence;
//    }
//
//    public void setProjectIdentifier(Integer PTSequence) {
//        this.PTSequence = PTSequence;
//    }
//
//    public String getProjectIdentifier() {
//        return projectIdentifier;
//    }
//
//    public void setProjectIdentifier(String projectIdentifier) {
//        this.projectIdentifier = projectIdentifier;
//    }
//}
