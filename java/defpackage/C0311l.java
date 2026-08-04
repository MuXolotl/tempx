package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0311l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f1357l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f1358l;

    public C0311l() {
        super(0);
        ArrayList arrayList = new ArrayList();
        C11521l c11521l = new C11521l(0, EnumC17281l.f33524l);
        while (c11521l.hasNext()) {
            Object next = c11521l.next();
            if (((EnumC17281l) next).f33528l) {
                arrayList.add(next);
            }
        }
        this.f1357l = arrayList;
        C10892l c10892l = C10892l.yandex;
        c10892l.getClass();
        C8634l c8634l = C10892l.metrica;
        InterfaceC13922l interfaceC13922l = C10892l.loadAd[9];
        this.f1358l = AbstractC8020l.smaato((Boolean) c8634l.pro(c10892l));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m423import(boolean z) {
        if (z) {
            new C13330l(R.string.libvkx_enable_warn_title, R.string.libvkx_enable_warn_desc, R.string.cancel, null, new C8520l(this, 1), new C8520l(this, 2), new C8520l(this, 3), 32).Signature(isVip());
        } else {
            this.f1358l.setValue(Boolean.FALSE);
            C10892l.yandex.yandex(false);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C0311l c0311l;
        C6956l c6956l2;
        c6956l.m2133new(688305982);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                c0311l = this;
                C13246l c13246l = new C13246l(0, c0311l, C0311l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 7);
                c6956l.m2147try(c13246l);
                objM2132native = c13246l;
            } else {
                c0311l = this;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            boolean zAdmob2 = c6956l.admob(c0311l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C15079l(22, c0311l);
                c6956l.m2147try(objM2132native2);
            }
            c6956l2 = c6956l;
            AbstractC7837l.yandex(AbstractC0509l.yandex, function0, null, (Function1) objM2132native2, c6956l2, 6, 4);
        } else {
            c0311l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7321l(c0311l, i);
        }
    }
}
