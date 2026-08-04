package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًؙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6161l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5364l f12971l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12972l;

    public /* synthetic */ C6161l(C5364l c5364l, int i) {
        this.f12972l = 0;
        this.f12971l = c5364l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String strMopub;
        int i3 = this.f12972l;
        C5364l c5364l = this.f12971l;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                c5364l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    if (((String) c5364l.f11500l.getValue()).length() == 0) {
                        i = -545145812;
                        i2 = R.string.external_int_activate;
                    } else {
                        i = -545034119;
                        i2 = R.string.lvm_pref;
                    }
                    AbstractC13010l.loadAd(AbstractC12900l.mopub(c6956l, i, i2, c6956l, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C10086l c10086l = c5364l.f11500l;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((String) c10086l.getValue()).length() > 0) {
                        c6956l2.m2123default(-772658333);
                        strMopub = AbstractC11999l.amazon(R.string.lvm_pref_signed, new Object[]{(String) c10086l.getValue()}, c6956l2);
                        c6956l2.startapp(false);
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l2, -772540719, R.string.lvm_pref_anon, c6956l2, false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6161l(C5364l c5364l, int i, byte b) {
        this.f12972l = i;
        this.f12971l = c5364l;
    }
}
