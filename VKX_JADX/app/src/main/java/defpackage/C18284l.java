package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lً٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18284l extends AbstractC8791l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f35780l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35781l = 0;

    public C18284l(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f35780l = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.AbstractC8791l
    public AbstractC8791l amazon() {
        switch (this.f35781l) {
            case 1:
                return (AbstractC8791l) this.f35780l;
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.InterfaceC0629l
    public final boolean apply(Object obj) {
        switch (this.f35781l) {
            case 0:
                break;
        }
        return crashlytics(((Character) obj).charValue());
    }

    @Override // defpackage.AbstractC8791l
    public final boolean crashlytics(char c) {
        switch (this.f35781l) {
            case 0:
                return Arrays.binarySearch((char[]) this.f35780l, c) >= 0;
            default:
                return !((AbstractC8791l) this.f35780l).crashlytics(c);
        }
    }

    public final String toString() {
        int i = this.f35781l;
        Object obj = this.f35780l;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(AbstractC8791l.yandex(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((AbstractC8791l) obj) + ".negate()";
        }
    }

    public C18284l(AbstractC8791l abstractC8791l) {
        abstractC8791l.getClass();
        this.f35780l = abstractC8791l;
    }
}
