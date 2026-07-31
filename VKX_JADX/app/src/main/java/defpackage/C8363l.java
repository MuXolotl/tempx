package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: lًۣٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8363l extends ActionMode {
    public final AbstractC12048l loadAd;
    public final Context yandex;

    public C8363l(Context context, AbstractC12048l abstractC12048l) {
        this.yandex = context;
        this.loadAd = abstractC12048l;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.loadAd.loadAd();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.loadAd.crashlytics();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0062l(this.yandex, this.loadAd.amazon());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.loadAd.purchase();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.loadAd.mopub();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.loadAd.f23976l;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.loadAd.admob();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.loadAd.f23977l;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.loadAd.isPro();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.loadAd.smaato();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.loadAd.remoteconfig(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.loadAd.metrica(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.loadAd.f23976l = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.loadAd.adcel(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.loadAd.ads(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.loadAd.vip(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.loadAd.startapp(i);
    }
}
