package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15680l extends AbstractC2484l implements InterfaceC0489l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C11560l f30818l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f30819l = "";

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public void appmetrica() {
        super.appmetrica();
        Iterator it = mo2201new().iterator();
        while (it.hasNext()) {
            ((AbstractC17777l) it.next()).appmetrica();
        }
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public AbstractC14412l mo647case() {
        return new C11390l(mo2202super(), false, new C1412l(16, this));
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public final String mo648continue() {
        return this.f30819l;
    }

    /* JADX INFO: renamed from: goto */
    public int mo2198goto() {
        return 0;
    }

    /* JADX INFO: renamed from: import */
    public void mo2199import(int i, float f) {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        ((C11390l) abstractC14412l).firebase(i, f);
    }

    @Override // defpackage.AbstractC17777l
    public void inmobi() {
        super.inmobi();
        Iterator it = mo2201new().iterator();
        while (it.hasNext()) {
            ((AbstractC17777l) it.next()).inmobi();
        }
    }

    /* JADX INFO: renamed from: new */
    public abstract List mo2201new();

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp */
    public void mo1148strictfp() {
        super.mo1148strictfp();
        Iterator it = mo2201new().iterator();
        while (it.hasNext()) {
            ((AbstractC2484l) it.next()).mo1148strictfp();
        }
    }

    public void subs() {
        List listMo2201new = mo2201new();
        C11560l c11560l = this.f30818l;
        if (c11560l == null) {
            c11560l = null;
        }
        Object objM4220for = AbstractC16901l.m4220for(c11560l.getCurrentItem(), listMo2201new);
        InterfaceC0489l interfaceC0489l = objM4220for instanceof InterfaceC0489l ? (InterfaceC0489l) objM4220for : null;
        if (interfaceC0489l != null) {
            interfaceC0489l.subs();
        }
    }

    /* JADX INFO: renamed from: super */
    public abstract List mo2202super();

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: switch */
    public View mo1149switch(Context context, LayoutInflater layoutInflater) {
        if (mo2201new().size() != mo2202super().size()) {
            C8339l.metrica("fragments.size != titles.size");
            return null;
        }
        C11560l c11560l = new C11560l((Activity) context, null);
        c11560l.f23235l = true;
        this.f30818l = c11560l;
        c11560l.setId(R.id.viewpager);
        C11560l c11560l2 = this.f30818l;
        if (c11560l2 == null) {
            c11560l2 = null;
        }
        c11560l2.setOffscreenPageLimit(mo2201new().size());
        C12291l c12291l = new C12291l(this);
        C11560l c11560l3 = this.f30818l;
        if (c11560l3 == null) {
            c11560l3 = null;
        }
        c11560l3.setAdapter(c12291l);
        C11560l c11560l4 = this.f30818l;
        if (c11560l4 == null) {
            c11560l4 = null;
        }
        c11560l4.addOnPageChangeListener(new C11719l(this));
        C11560l c11560l5 = this.f30818l;
        if (c11560l5 == null) {
            c11560l5 = null;
        }
        c11560l5.setCurrentItem(mo2198goto(), false);
        C11560l c11560l6 = this.f30818l;
        if (c11560l6 != null) {
            return c11560l6;
        }
        return null;
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: synchronized */
    public final void mo2208synchronized() {
        super.mo2208synchronized();
        Iterator it = mo2201new().iterator();
        while (it.hasNext()) {
            ((AbstractC17777l) it.next()).mo2208synchronized();
        }
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: default */
    public final void mo1143default() {
    }
}
