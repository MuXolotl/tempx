package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: lؙِۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12048l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f23976l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f23977l = false;

    public abstract void adcel(CharSequence charSequence);

    public abstract CharSequence admob();

    public abstract void ads(boolean z);

    public abstract MenuC4984l amazon();

    public abstract View crashlytics();

    public abstract Object firebase();

    public abstract void isPro();

    public abstract void loadAd();

    public abstract void metrica(CharSequence charSequence);

    public abstract CharSequence mopub();

    public abstract MenuInflater purchase();

    public abstract void remoteconfig(View view);

    public abstract boolean smaato();

    public abstract void startapp(int i);

    public Object subs() {
        if (!this.f23977l) {
            this.f23976l = firebase();
            this.f23977l = true;
        }
        return this.f23976l;
    }

    public abstract void vip(int i);
}
