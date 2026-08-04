package defpackage;

/* JADX INFO: renamed from: lٌؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8493l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C8493l c8493l = EnumC13392l.f26295l;
        switch (i) {
            case 0:
                return EnumC13392l.SUCCESS;
            case 1:
                return EnumC13392l.NOT_FOUND;
            case 2:
                return EnumC13392l.ALREADY_USED_ELSEWHERE;
            case 3:
                return EnumC13392l.ALREADY_USED_HERE;
            case 4:
                return EnumC13392l.HAS_THIS_ONE_TIME_ENTITLEMENT;
            case 5:
                return EnumC13392l.EXPIRED;
            case 6:
                return EnumC13392l.FLOOD_WAIT;
            case 7:
                return EnumC13392l.NO_USES_LEFT;
            default:
                return null;
        }
    }
}
