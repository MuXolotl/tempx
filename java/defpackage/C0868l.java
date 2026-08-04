package defpackage;

/* JADX INFO: renamed from: lٍؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0868l extends AbstractC3476l {
    public final String crashlytics;

    public C0868l(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.crashlytics = str;
    }

    @Override // defpackage.AbstractC3476l
    public final InterfaceC5066l yandex(int i, int i2, Object obj, String str) {
        String string = str.subSequence(i, i2).toString();
        String str2 = this.crashlytics;
        if (AbstractC8576l.yandex(string, str2)) {
            return null;
        }
        return new C16751l(str2, 1);
    }
}
