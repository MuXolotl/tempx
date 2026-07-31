package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّٟؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12752l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f25123l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f25124l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f25125l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f25126l;

    public C12752l() {
        EnumC0442l enumC0442l;
        super(0);
        ArrayList arrayList = new ArrayList();
        C14092l c14092l = EnumC0442l.f1616l;
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            Object next = c11521l.next();
            EnumC0442l enumC0442l2 = (EnumC0442l) next;
            if (enumC0442l2 != EnumC0442l.Monet || AbstractC11173l.crashlytics()) {
                if (enumC0442l2.f1622l) {
                    arrayList.add(next);
                }
            }
        }
        this.f25125l = arrayList;
        C11521l c11521l2 = new C11521l(0, c14092l);
        while (c11521l2.hasNext()) {
            enumC0442l = (EnumC0442l) c11521l2.next();
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (AbstractC14147l.yandex(vKXApplication == null ? null : vKXApplication, enumC0442l)) {
                C10086l c10086lSmaato = AbstractC8020l.smaato(enumC0442l);
                this.f25126l = c10086lSmaato;
                this.f25124l = AbstractC8020l.smaato((EnumC0442l) c10086lSmaato.getValue());
                this.f25123l = AbstractC8020l.smaato(Boolean.FALSE);
            }
        }
        enumC0442l = EnumC0442l.Default;
        C10086l c10086lSmaato2 = AbstractC8020l.smaato(enumC0442l);
        this.f25126l = c10086lSmaato2;
        this.f25124l = AbstractC8020l.smaato((EnumC0442l) c10086lSmaato2.getValue());
        this.f25123l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final void m3500import(C12752l c12752l, EnumC0442l enumC0442l) {
        if (((Boolean) c12752l.f25123l.getValue()).booleanValue() || enumC0442l.f1623l) {
            c12752l.f25124l.setValue(enumC0442l);
        } else {
            new C14107l().Signature(c12752l.isVip());
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final EnumC0442l m3501abstract() {
        return (EnumC0442l) this.f25124l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-314372935);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            int i3 = 11;
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C14951l(this, null, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(374314613, new C9772l(c13072lYandex, this, i3), c6956l), null, null, AbstractC14566l.amazon(-771045038, new C4629l(this, b, b), c6956l), 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1313056374, new C7442l(c13072lYandex, this, 20), c6956l), c6956l, 805330992, 237);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4629l(this, i);
        }
    }
}
