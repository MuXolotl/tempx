package defpackage;

/* JADX INFO: renamed from: lْٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC13392l implements InterfaceC16520l {
    SUCCESS(0),
    NOT_FOUND(1),
    ALREADY_USED_ELSEWHERE(2),
    ALREADY_USED_HERE(3),
    HAS_THIS_ONE_TIME_ENTITLEMENT(4),
    EXPIRED(5),
    FLOOD_WAIT(6),
    NO_USES_LEFT(7);


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f26302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C8493l f26295l = new C8493l(1, AbstractC18202l.yandex.loadAd(EnumC13392l.class), 2, SUCCESS);

    EnumC13392l(int i) {
        this.f26302l = i;
    }

    @Override // defpackage.InterfaceC16520l
    public final int getValue() {
        return this.f26302l;
    }
}
