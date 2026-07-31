package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1436l.class)
public final class C2271l extends AbstractC3160l {
    public static final C9578l Companion = new C9578l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f4958l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4959l;

    public C2271l(String str, String str2) {
        this.f4959l = str;
        char[] charArray = str2.toCharArray();
        if (charArray.length > 1) {
            Arrays.sort(charArray);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : charArray) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        this.f4958l = sb.toString();
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C2271l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C2271l c2271l = (C2271l) obj;
        return AbstractC8576l.yandex(this.f4959l, c2271l.f4959l) && AbstractC8576l.yandex(this.f4958l, c2271l.f4958l);
    }

    public final int hashCode() {
        return this.f4958l.hashCode() + (this.f4959l.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonRegularExpression(pattern='");
        sb.append(this.f4959l);
        sb.append("', options='");
        return AbstractC0653l.ads(sb, this.f4958l, "')");
    }
}
