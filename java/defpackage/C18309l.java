package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lۣ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18309l extends Drawable.ConstantState {
    public final float admob;
    public ColorStateList amazon;
    public PorterDuff.Mode billing;
    public ColorStateList crashlytics;
    public int firebase;
    public float isPro;
    public C4079l loadAd;
    public int metrica;
    public Rect mopub;
    public ColorStateList purchase;
    public float remoteconfig;
    public float smaato;
    public final Paint.Style startapp;
    public float subs;
    public int vip;
    public C12564l yandex;

    public C18309l(C18309l c18309l) {
        this.crashlytics = null;
        this.amazon = null;
        this.purchase = null;
        this.billing = PorterDuff.Mode.SRC_IN;
        this.mopub = null;
        this.admob = 1.0f;
        this.subs = 1.0f;
        this.firebase = 255;
        this.smaato = 0.0f;
        this.remoteconfig = 0.0f;
        this.vip = 0;
        this.metrica = 0;
        this.startapp = Paint.Style.FILL_AND_STROKE;
        this.yandex = c18309l.yandex;
        this.loadAd = c18309l.loadAd;
        this.isPro = c18309l.isPro;
        this.crashlytics = c18309l.crashlytics;
        this.amazon = c18309l.amazon;
        this.billing = c18309l.billing;
        this.purchase = c18309l.purchase;
        this.firebase = c18309l.firebase;
        this.admob = c18309l.admob;
        this.metrica = c18309l.metrica;
        this.subs = c18309l.subs;
        this.smaato = c18309l.smaato;
        this.remoteconfig = c18309l.remoteconfig;
        this.vip = c18309l.vip;
        this.startapp = c18309l.startapp;
        if (c18309l.mopub != null) {
            this.mopub = new Rect(c18309l.mopub);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C5022l c5022l = new C5022l(this);
        c5022l.f10267l = true;
        return c5022l;
    }

    public C18309l(C12564l c12564l) {
        this.crashlytics = null;
        this.amazon = null;
        this.purchase = null;
        this.billing = PorterDuff.Mode.SRC_IN;
        this.mopub = null;
        this.admob = 1.0f;
        this.subs = 1.0f;
        this.firebase = 255;
        this.smaato = 0.0f;
        this.remoteconfig = 0.0f;
        this.vip = 0;
        this.metrica = 0;
        this.startapp = Paint.Style.FILL_AND_STROKE;
        this.yandex = c12564l;
        this.loadAd = null;
    }
}
