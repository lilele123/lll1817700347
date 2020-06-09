package DB;

public class Department {

	private $id = null;
    public function setId($id)
    {
        $this->id = $id;
    }

    public function getId($id)
    {
        return $this->id;
    }

    private $name = null;
    public function setName($name)
    {
        $this->name = $name;
    }

    public function getName($name)
    {
        return $this->id;
    }
}
