package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: renamed from: lُۛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC11323l {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(AbstractC0135l.yandex, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(AbstractC0135l.loadAd, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(AbstractC0135l.crashlytics, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(AbstractC0135l.amazon, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(AbstractC0135l.purchase, Build.VERSION.SDK_INT <= 26 ? ua.itaysonlab.vkx.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f22825l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f22826l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f22827l;

    EnumC11323l(Object obj, int i, int i2) {
        this.f22827l = obj;
        this.f22826l = i;
        this.f22825l = i2;
    }
}
