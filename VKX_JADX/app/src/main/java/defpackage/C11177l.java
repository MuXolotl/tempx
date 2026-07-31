package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٜٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11177l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11177l f22467l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C11177l f22468l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11177l f22469l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11177l f22470l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C11177l f22471l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22472l;

    static {
        int i = 1;
        f22467l = new C11177l(i, 0);
        f22470l = new C11177l(i, 1);
        f22469l = new C11177l(i, 2);
        f22471l = new C11177l(i, 3);
        f22468l = new C11177l(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11177l(C10700l c10700l) {
        super(1);
        this.f22472l = 9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22472l) {
            case 0:
                return Boolean.valueOf(((EnumC18226l) obj) == EnumC18226l.f35693l);
            case 1:
                return Unit.INSTANCE;
            case 2:
                int i = ((C14694l) obj).yandex;
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                int i2 = ((C14694l) obj).yandex;
                return Unit.INSTANCE;
            case 5:
                return new C4999l((((long) ((int) (((C4999l) obj).yandex & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 6:
                return new C4999l((((long) ((int) (((C4999l) obj).yandex >> 32))) << 32) | (4294967295L & ((long) 0)));
            case 7:
                return new C4999l((((long) ((int) (((C4999l) obj).yandex & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 8:
                return new C4999l((((long) ((int) (((C4999l) obj).yandex >> 32))) << 32) | (4294967295L & ((long) 0)));
            default:
                ((AbstractC17886l) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11177l(int i, int i2) {
        super(i);
        this.f22472l = i2;
    }
}
