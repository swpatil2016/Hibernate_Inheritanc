Model -> Getter&Setter -> @MapSuperClass dependency download ->
DB browser (+) MySql connection -> create database inheritance ->
add configuration in application.properties -> To create tables of model
in a database create Repository -> JpaRepository problem -> problem solve(See
Readme2.md) -> Run the App -> Table created inside database.
--------------------------------------------------------------------------
-> In time of join Table inheritance the extra column add in all childClass of user as foreign 
key.

-> We can rename foreign key column with the help of @@PrimaryKeyJoinColumn

----------------------------------------------------------------
-> There are the repositories with same names but in actual they 
are different. To avoid the spring ambiguity we give the name in 
@Repository() to differentiate them. To call the we use another 
annotation @Qualifier.