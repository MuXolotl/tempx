package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12159l {
    public boolean adcel;
    public int admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public ColorStateList firebase;
    public ColorStateList isPro;
    public C12564l loadAd;
    public int mopub;
    public int purchase;
    public C5022l remoteconfig;
    public ColorStateList smaato;
    public PorterDuff.Mode subs;
    public RippleDrawable subscription;
    public int tapsense;
    public final MaterialButton yandex;
    public boolean vip = false;
    public boolean metrica = false;
    public boolean startapp = false;
    public boolean ads = true;

    public C12159l(MaterialButton materialButton, C12564l c12564l) {
        this.yandex = materialButton;
        this.loadAd = c12564l;
    }

    public final void amazon(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        MaterialButton materialButton = this.yandex;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.purchase;
        int i4 = this.billing;
        this.billing = i2;
        this.purchase = i;
        if (!this.metrica) {
            purchase();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void billing() {
        C5022l c5022lLoadAd = loadAd(false);
        C5022l c5022lLoadAd2 = loadAd(true);
        if (c5022lLoadAd != null) {
            float f = this.admob;
            ColorStateList colorStateList = this.firebase;
            c5022lLoadAd.f10262l.isPro = f;
            c5022lLoadAd.invalidateSelf();
            C18309l c18309l = c5022lLoadAd.f10262l;
            if (c18309l.amazon != colorStateList) {
                c18309l.amazon = colorStateList;
                c5022lLoadAd.onStateChange(c5022lLoadAd.getState());
            }
            if (c5022lLoadAd2 != null) {
                float f2 = this.admob;
                int iMetrica = this.vip ? AbstractC6689l.metrica(this.yandex, R.attr.colorSurface) : 0;
                c5022lLoadAd2.f10262l.isPro = f2;
                c5022lLoadAd2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iMetrica);
                C18309l c18309l2 = c5022lLoadAd2.f10262l;
                if (c18309l2.amazon != colorStateListValueOf) {
                    c18309l2.amazon = colorStateListValueOf;
                    c5022lLoadAd2.onStateChange(c5022lLoadAd2.getState());
                }
            }
        }
    }

    public final void crashlytics(C12564l c12564l) {
        this.loadAd = c12564l;
        if (loadAd(false) != null) {
            loadAd(false).setShapeAppearanceModel(c12564l);
        }
        if (loadAd(true) != null) {
            loadAd(true).setShapeAppearanceModel(c12564l);
        }
        if (yandex() != null) {
            yandex().setShapeAppearanceModel(c12564l);
        }
    }

    public final C5022l loadAd(boolean z) {
        RippleDrawable rippleDrawable = this.subscription;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C5022l) ((LayerDrawable) ((InsetDrawable) this.subscription.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void purchase() {
        C5022l c5022l = new C5022l(this.loadAd);
        MaterialButton materialButton = this.yandex;
        c5022l.mopub(materialButton.getContext());
        c5022l.setTintList(this.isPro);
        PorterDuff.Mode mode = this.subs;
        if (mode != null) {
            c5022l.setTintMode(mode);
        }
        float f = this.admob;
        ColorStateList colorStateList = this.firebase;
        c5022l.f10262l.isPro = f;
        c5022l.invalidateSelf();
        C18309l c18309l = c5022l.f10262l;
        if (c18309l.amazon != colorStateList) {
            c18309l.amazon = colorStateList;
            c5022l.onStateChange(c5022l.getState());
        }
        C5022l c5022l2 = new C5022l(this.loadAd);
        c5022l2.setTint(0);
        float f2 = this.admob;
        int iMetrica = this.vip ? AbstractC6689l.metrica(materialButton, R.attr.colorSurface) : 0;
        c5022l2.f10262l.isPro = f2;
        c5022l2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iMetrica);
        C18309l c18309l2 = c5022l2.f10262l;
        if (c18309l2.amazon != colorStateListValueOf) {
            c18309l2.amazon = colorStateListValueOf;
            c5022l2.onStateChange(c5022l2.getState());
        }
        C5022l c5022l3 = new C5022l(this.loadAd);
        this.remoteconfig = c5022l3;
        c5022l3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC14521l.loadAd(this.smaato), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c5022l2, c5022l}), this.crashlytics, this.purchase, this.amazon, this.billing), this.remoteconfig);
        this.subscription = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C5022l c5022lLoadAd = loadAd(false);
        if (c5022lLoadAd != null) {
            c5022lLoadAd.subs(this.tapsense);
            c5022lLoadAd.setState(materialButton.getDrawableState());
        }
    }

    public final InterfaceC15751l yandex() {
        RippleDrawable rippleDrawable = this.subscription;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.subscription.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.subscription;
        return numberOfLayers > 2 ? (InterfaceC15751l) rippleDrawable2.getDrawable(2) : (InterfaceC15751l) rippleDrawable2.getDrawable(1);
    }
}
