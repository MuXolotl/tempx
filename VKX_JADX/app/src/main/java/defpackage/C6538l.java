package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lؙ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6538l extends AbstractC12048l implements InterfaceC17433l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Context f13643l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f13644l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public MenuC4984l f13645l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10023l f13646l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ActionBarContextView f13647l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public WeakReference f13648l;

    @Override // defpackage.AbstractC12048l
    public final void adcel(CharSequence charSequence) {
        this.f13647l.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC12048l
    public final CharSequence admob() {
        return this.f13647l.getTitle();
    }

    @Override // defpackage.AbstractC12048l
    public final void ads(boolean z) {
        this.f23977l = z;
        this.f13647l.setTitleOptional(z);
    }

    @Override // defpackage.AbstractC12048l
    public final MenuC4984l amazon() {
        return this.f13645l;
    }

    @Override // defpackage.InterfaceC17433l
    public final void billing(MenuC4984l menuC4984l) {
        isPro();
        C0791l c0791l = this.f13647l.f117l;
        if (c0791l != null) {
            c0791l.smaato();
        }
    }

    @Override // defpackage.AbstractC12048l
    public final View crashlytics() {
        WeakReference weakReference = this.f13648l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC12048l
    public final void isPro() {
        this.f13646l.m2833throws(this, this.f13645l);
    }

    @Override // defpackage.AbstractC12048l
    public final void loadAd() {
        if (this.f13644l) {
            return;
        }
        this.f13644l = true;
        this.f13646l.inmobi(this);
    }

    @Override // defpackage.AbstractC12048l
    public final void metrica(CharSequence charSequence) {
        this.f13647l.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC12048l
    public final CharSequence mopub() {
        return this.f13647l.getSubtitle();
    }

    @Override // defpackage.AbstractC12048l
    public final MenuInflater purchase() {
        return new C10471l(this.f13647l.getContext());
    }

    @Override // defpackage.AbstractC12048l
    public final void remoteconfig(View view) {
        this.f13647l.setCustomView(view);
        this.f13648l = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.AbstractC12048l
    public final boolean smaato() {
        return this.f13647l.f112l;
    }

    @Override // defpackage.AbstractC12048l
    public final void startapp(int i) {
        adcel(this.f13643l.getString(i));
    }

    @Override // defpackage.AbstractC12048l
    public final void vip(int i) {
        metrica(this.f13643l.getString(i));
    }

    @Override // defpackage.InterfaceC17433l
    public final boolean yandex(MenuC4984l menuC4984l, MenuItem menuItem) {
        return ((C12014l) this.f13646l.f20419l).m3310throw(this, menuItem);
    }
}
