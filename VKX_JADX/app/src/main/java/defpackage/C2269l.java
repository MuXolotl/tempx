package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lٍؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2269l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ VKProfile f4955l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4956l;

    public /* synthetic */ C2269l(VKProfile vKProfile, int i) {
        this.f4956l = i;
        this.f4955l = vKProfile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4956l;
        VKProfile vKProfile = this.f4955l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBilling = c6956l.billing(vKProfile);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        objM2132native = vKProfile.yandex();
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC7741l.purchase(vKProfile.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 36.0f), AbstractC7497l.yandex), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l2, 36912, 6, 31712);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
