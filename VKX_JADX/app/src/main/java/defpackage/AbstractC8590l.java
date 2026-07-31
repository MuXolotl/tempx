package defpackage;

/* JADX INFO: renamed from: lٌؘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8590l {
    public final int loadAd;
    public final int yandex;

    public AbstractC8590l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public void loadAd(InterfaceC0684l interfaceC0684l) {
        if (!(interfaceC0684l instanceof C15802l)) {
            throw new C13165l("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        yandex(((C15802l) interfaceC0684l).f31025l);
    }

    public void yandex(C11442l c11442l) {
        throw new C13165l("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
