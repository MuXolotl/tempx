package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16929l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8757l f33012l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33013l;

    public /* synthetic */ C16929l(C8757l c8757l, int i) {
        this.f33013l = i;
        this.f33012l = c8757l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String strMopub;
        int i3 = this.f33013l;
        C8757l c8757l = this.f33012l;
        switch (i3) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    if (((String) c8757l.f18021l.getValue()) != null) {
                        i = -1843034285;
                        i2 = R.string.lvm_pref;
                    } else {
                        i = -1842926746;
                        i2 = R.string.external_int_activate;
                    }
                    AbstractC13010l.loadAd(AbstractC12900l.mopub(c6956l, i, i2, c6956l, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C10086l c10086l = c8757l.f18021l;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((String) c10086l.getValue()) != null) {
                        c6956l2.m2123default(739970505);
                        String str = (String) c10086l.getValue();
                        if (str == null) {
                            str = "";
                        }
                        strMopub = AbstractC11999l.amazon(R.string.lvm_pref_signed, new Object[]{str}, c6956l2);
                        c6956l2.startapp(false);
                    } else {
                        strMopub = AbstractC12900l.mopub(c6956l2, 740207531, R.string.lvm_pref_anon, c6956l2, false);
                    }
                    AbstractC13010l.loadAd(strMopub, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c8757l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zAdmob = c6956l3.admob(c8757l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C3742l(c8757l, 0);
                        c6956l3.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC17824l.firebase, c6956l3, 805306368, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c8757l.m2429import((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16929l(C8757l c8757l, int i, int i2) {
        this.f33013l = i2;
        this.f33012l = c8757l;
    }
}
