public class ModelStore impliements IModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObservers;
    
    public ModelStore (IModelChangeObserver changeObservers){
        this.models = new PoligonalModel(new Poligon());
        this.flashes = new Flash();
        this.cameras = new Camera();
        this.changeObservers = changeObservers;
        this.scenes = new Scene(this.flashes,this.cameras,this.models);
    
    public Scene getScene(int n){
        return this.scenes;
    }
    
    @Override
    public void notifyChange(IModelChanger){
        
    }
}