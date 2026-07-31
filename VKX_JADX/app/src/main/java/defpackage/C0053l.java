package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lٖؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0053l extends AbstractC12048l implements InterfaceC17433l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Context f939l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5184l f940l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10023l f941l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final MenuC4984l f942l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public WeakReference f943l;

    public C0053l(C5184l c5184l, Context context, C10023l c10023l) {
        this.f940l = c5184l;
        this.f939l = context;
        this.f941l = c10023l;
        MenuC4984l menuC4984l = new MenuC4984l(context);
        menuC4984l.f10204l = 1;
        this.f942l = menuC4984l;
        menuC4984l.f10202l = this;
    }

    @Override // defpackage.AbstractC12048l
    public final void adcel(CharSequence charSequence) {
        this.f940l.billing.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC12048l
    public final CharSequence admob() {
        return this.f940l.billing.getTitle();
    }

    @Override // defpackage.AbstractC12048l
    public final void ads(boolean z) {
        this.f23977l = z;
        this.f940l.billing.setTitleOptional(z);
    }

    @Override // defpackage.AbstractC12048l
    public final MenuC4984l amazon() {
        return this.f942l;
    }

    @Override // defpackage.InterfaceC17433l
    public final void billing(MenuC4984l menuC4984l) {
        if (this.f941l == null) {
            return;
        }
        isPro();
        C0791l c0791l = this.f940l.billing.f117l;
        if (c0791l != null) {
            c0791l.smaato();
        }
    }

    @Override // defpackage.AbstractC12048l
    public final View crashlytics() {
        WeakReference weakReference = this.f943l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC12048l
    public final void isPro() {
        if (this.f940l.subs != this) {
            return;
        }
        MenuC4984l menuC4984l = this.f942l;
        menuC4984l.pro();
        try {
            this.f941l.m2833throws(this, menuC4984l);
        } finally {
            menuC4984l.license();
        }
    }

    @Override // defpackage.AbstractC12048l
    public final void loadAd() {
        C5184l c5184l = this.f940l;
        if (c5184l.subs != this) {
            return;
        }
        if (c5184l.startapp) {
            c5184l.isPro = this;
            c5184l.firebase = this.f941l;
        } else {
            this.f941l.inmobi(this);
        }
        this.f941l = null;
        c5184l.yandex(false);
        ActionBarContextView actionBarContextView = c5184l.billing;
        if (actionBarContextView.f121l == null) {
            actionBarContextView.purchase();
        }
        c5184l.crashlytics.setHideOnContentScrollEnabled(c5184l.Signature);
        c5184l.subs = null;
    }

    @Override // defpackage.AbstractC12048l
    public final void metrica(CharSequence charSequence) {
        this.f940l.billing.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC12048l
    public final CharSequence mopub() {
        return this.f940l.billing.getSubtitle();
    }

    @Override // defpackage.AbstractC12048l
    public final MenuInflater purchase() {
        return new C10471l(this.f939l);
    }

    @Override // defpackage.AbstractC12048l
    public final void remoteconfig(View view) {
        this.f940l.billing.setCustomView(view);
        this.f943l = new WeakReference(view);
    }

    @Override // defpackage.AbstractC12048l
    public final boolean smaato() {
        return this.f940l.billing.f112l;
    }

    @Override // defpackage.AbstractC12048l
    public final void startapp(int i) {
        adcel(this.f940l.yandex.getResources().getString(i));
    }

    @Override // defpackage.AbstractC12048l
    public final void vip(int i) {
        metrica(this.f940l.yandex.getResources().getString(i));
    }

    @Override // defpackage.InterfaceC17433l
    public final boolean yandex(MenuC4984l menuC4984l, MenuItem menuItem) {
        C10023l c10023l = this.f941l;
        if (c10023l != null) {
            return ((C12014l) c10023l.f20419l).m3310throw(this, menuItem);
        }
        return false;
    }
}
