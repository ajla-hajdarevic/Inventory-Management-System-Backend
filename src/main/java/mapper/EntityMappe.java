package mapper;

public interface EntityMappe<D, E> {
    E toEntity(D dto);
}
