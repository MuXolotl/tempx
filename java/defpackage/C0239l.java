package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؘُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0239l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f1225l = AtomicReferenceFieldUpdater.newUpdater(C0239l.class, Object.class, "lؗۤؑ");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile Object f1226l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f1227l;

    public /* synthetic */ C0239l(String str, byte[] bArr) {
        this.f1227l = str;
        this.f1226l = bArr;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f1227l.compareTo((String) obj);
    }

    public final /* synthetic */ void yandex(byte[] bArr) {
        byte[][] bArr2;
        int i = 0;
        while (true) {
            Object obj = this.f1226l;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1225l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }
}
