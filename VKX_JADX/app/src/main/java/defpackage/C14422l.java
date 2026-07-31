package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: lٓۛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14422l implements InterfaceC1963l, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public MenuC4984l f28232l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public LayoutInflater f28233l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Context f28234l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1076l f28235l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ExpandedMenuView f28236l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11377l f28237l;

    public C14422l(ContextWrapper contextWrapper) {
        this.f28234l = contextWrapper;
        this.f28233l = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean admob(C17858l c17858l) {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void billing(InterfaceC1076l interfaceC1076l) {
        throw null;
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean crashlytics(SubMenuC3166l subMenuC3166l) {
        boolean zHasVisibleItems = subMenuC3166l.hasVisibleItems();
        Context context = subMenuC3166l.f10197l;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0001l dialogInterfaceOnKeyListenerC0001l = new DialogInterfaceOnKeyListenerC0001l();
        dialogInterfaceOnKeyListenerC0001l.f849l = subMenuC3166l;
        C14785l c14785l = new C14785l(context);
        C14225l c14225l = (C14225l) c14785l.f28907l;
        C14422l c14422l = new C14422l(c14225l.yandex);
        dialogInterfaceOnKeyListenerC0001l.f847l = c14422l;
        c14422l.f28235l = dialogInterfaceOnKeyListenerC0001l;
        subMenuC3166l.loadAd(c14422l, context);
        C14422l c14422l2 = dialogInterfaceOnKeyListenerC0001l.f847l;
        if (c14422l2.f28237l == null) {
            c14422l2.f28237l = new C11377l(c14422l2);
        }
        c14225l.vip = c14422l2.f28237l;
        c14225l.metrica = dialogInterfaceOnKeyListenerC0001l;
        View view = subMenuC3166l.f10201l;
        if (view != null) {
            c14225l.purchase = view;
        } else {
            c14225l.crashlytics = subMenuC3166l.f10208l;
            c14225l.amazon = subMenuC3166l.f10188l;
        }
        c14225l.remoteconfig = dialogInterfaceOnKeyListenerC0001l;
        DialogInterfaceC13913l dialogInterfaceC13913lIsPro = c14785l.isPro();
        dialogInterfaceOnKeyListenerC0001l.f848l = dialogInterfaceC13913lIsPro;
        dialogInterfaceC13913lIsPro.setOnDismissListener(dialogInterfaceOnKeyListenerC0001l);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0001l.f848l.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0001l.f848l.show();
        InterfaceC1076l interfaceC1076l = this.f28235l;
        if (interfaceC1076l == null) {
            return true;
        }
        interfaceC1076l.mo248try(subMenuC3166l);
        return true;
    }

    @Override // defpackage.InterfaceC1963l
    public final void firebase(Context context, MenuC4984l menuC4984l) {
        if (this.f28234l != null) {
            this.f28234l = context;
            if (this.f28233l == null) {
                this.f28233l = LayoutInflater.from(context);
            }
        }
        this.f28232l = menuC4984l;
        C11377l c11377l = this.f28237l;
        if (c11377l != null) {
            c11377l.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f28232l.adcel(this.f28237l.getItem(i), this, 0);
    }

    @Override // defpackage.InterfaceC1963l
    public final boolean purchase(C17858l c17858l) {
        return false;
    }

    @Override // defpackage.InterfaceC1963l
    public final void subs() {
        C11377l c11377l = this.f28237l;
        if (c11377l != null) {
            c11377l.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC1963l
    public final void yandex(MenuC4984l menuC4984l, boolean z) {
        InterfaceC1076l interfaceC1076l = this.f28235l;
        if (interfaceC1076l != null) {
            interfaceC1076l.yandex(menuC4984l, z);
        }
    }
}
