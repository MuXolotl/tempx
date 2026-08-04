package defpackage;

import android.text.Editable;

/* JADX INFO: renamed from: lِۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12142l extends Editable.Factory {
    public static Class crashlytics;
    public static volatile C12142l loadAd;
    public static final Object yandex = new Object();

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = crashlytics;
        return cls != null ? new C6988l(cls, charSequence) : super.newEditable(charSequence);
    }
}
