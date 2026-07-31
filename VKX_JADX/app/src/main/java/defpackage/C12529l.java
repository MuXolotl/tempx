package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lُِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12529l extends AbstractC17897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f24684l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f24685l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f24686l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f24687l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f24688l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f24689l;

    public C12529l(C13291l c13291l, long j, long j2) {
        List list;
        boolean z;
        super(true);
        this.f24685l = 0L;
        this.f24686l = 1;
        this.f24688l = Collections.singletonList(c13291l);
        this.f24687l = Collections.EMPTY_LIST;
        this.f24685l = j;
        this.f24689l = j2;
        this.f24684l = false;
        synchronized (this) {
            list = this.f24688l;
        }
        int size = list.size();
        long[] jArr = new long[size];
        long jYandex = yandex();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            int i = ((C13291l) list.get(size2)).f26080l.crashlytics;
            jArr[size2] = ((long) ((1 << i) - 1)) & jYandex;
            jYandex >>>= i;
        }
        C13291l[] c13291lArr = (C13291l[]) list.toArray(new C13291l[list.size()]);
        List list2 = this.f24687l;
        C16834l[] c16834lArr = (C16834l[]) list2.toArray(new C16834l[list2.size()]);
        C13291l c13291l2 = (C13291l) this.f24688l.get(0);
        long jAmazon = c13291lArr[0].amazon() - 1;
        long j3 = jArr[0];
        if (jAmazon != j3) {
            c13291lArr[0] = AbstractC17541l.crashlytics(c13291l2.f26080l, c13291l2.f26086l, (int) j3, AbstractC14024l.crashlytics(c13291l2.f26083l), AbstractC14024l.crashlytics(c13291l2.f26088l));
            z = true;
        } else {
            z = false;
        }
        int i2 = 1;
        while (i2 < size) {
            int i3 = i2 - 1;
            C13291l c13291l3 = c13291lArr[i3];
            int i4 = c13291l3.f26086l.loadAd;
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[i4];
            C1577l c1577l = new C1577l(AbstractC14024l.crashlytics(c13291l3.f26083l), AbstractC14024l.crashlytics(c13291l3.f26088l), AbstractC9151l.admob(c13291l3.f26086l));
            int i5 = size;
            long[] jArr2 = jArr;
            c1577l.f3898l = (int) jArr2[i3];
            c1577l.f3897l = -2;
            c1577l.loadAd(0, true, bArr2);
            byte[] bArr3 = new byte[i4];
            c1577l.loadAd(0, false, bArr3);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z2 = i2 >= i5 + (-1) ? jArr2[i2] == ((long) c13291lArr[i2].amazon()) : jArr2[i2] == ((long) (c13291lArr[i2].amazon() - 1));
            if (Arrays.equals(bArr, AbstractC14024l.crashlytics(c13291lArr[i2].f26083l)) && Arrays.equals(bArr2, AbstractC14024l.crashlytics(c13291lArr[i2].f26088l))) {
                if (!z2) {
                    c13291lArr[i2] = AbstractC17541l.crashlytics(((C13291l) list.get(i2)).f26080l, ((C13291l) list.get(i2)).f26086l, (int) jArr2[i2], bArr, bArr2);
                }
                i2++;
                size = i5;
                jArr = jArr2;
            } else {
                C13291l c13291lCrashlytics = AbstractC17541l.crashlytics(((C13291l) list.get(i2)).f26080l, ((C13291l) list.get(i2)).f26086l, (int) jArr2[i2], bArr, bArr2);
                c13291lArr[i2] = c13291lCrashlytics;
                c16834lArr[i3] = AbstractC17541l.amazon(c13291lArr[i3], c13291lCrashlytics.billing().loadAd());
            }
            z = true;
            i2++;
            size = i5;
            jArr = jArr2;
        }
        if (z) {
            crashlytics(c13291lArr, c16834lArr);
        }
    }

    public static C12529l loadAd(Object obj) {
        Throwable th;
        if (obj instanceof C12529l) {
            return (C12529l) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                C8339l.smaato("unknown version for hss private key");
                return null;
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(C13291l.purchase(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(C16834l.yandex(obj));
            }
            return new C12529l(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return loadAd(AbstractC7016l.crashlytics((InputStream) obj));
            }
            C8339l.metrica(AbstractC15560l.subscription(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    C12529l c12529lLoadAd = loadAd(dataInputStream3);
                    dataInputStream3.close();
                    return c12529lLoadAd;
                } catch (Exception unused) {
                    C13291l c13291lPurchase = C13291l.purchase(obj);
                    C12529l c12529l = new C12529l(c13291lPurchase, c13291lPurchase.amazon(), c13291lPurchase.f26085l);
                    dataInputStream3.close();
                    return c12529l;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object clone() {
        try {
            return loadAd(getEncoded());
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
            return null;
        }
    }

    public final void crashlytics(C13291l[] c13291lArr, C16834l[] c16834lArr) {
        synchronized (this) {
            this.f24688l = DesugarCollections.unmodifiableList(Arrays.asList(c13291lArr));
            this.f24687l = DesugarCollections.unmodifiableList(Arrays.asList(c16834lArr));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12529l.class != obj.getClass()) {
            return false;
        }
        C12529l c12529l = (C12529l) obj;
        if (this.f24686l == c12529l.f24686l && this.f24684l == c12529l.f24684l && this.f24689l == c12529l.f24689l && this.f24685l == c12529l.f24685l && this.f24688l.equals(c12529l.f24688l)) {
            return this.f24687l.equals(c12529l.f24687l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC8635l
    public final synchronized byte[] getEncoded() {
        C1770l c1770l;
        try {
            c1770l = new C1770l(8);
            c1770l.tapsense(0);
            c1770l.tapsense(this.f24686l);
            long j = this.f24685l;
            c1770l.tapsense((int) (j >>> 32));
            c1770l.tapsense((int) j);
            long j2 = this.f24689l;
            c1770l.tapsense((int) (j2 >>> 32));
            c1770l.tapsense((int) j2);
            ((ByteArrayOutputStream) c1770l.f4179l).write(this.f24684l ? 1 : 0);
            Iterator it = this.f24688l.iterator();
            while (it.hasNext()) {
                c1770l.loadAd((C13291l) it.next());
            }
            Iterator it2 = this.f24687l.iterator();
            while (it2.hasNext()) {
                c1770l.loadAd((C16834l) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return ((ByteArrayOutputStream) c1770l.f4179l).toByteArray();
    }

    public final int hashCode() {
        int iHashCode = (this.f24687l.hashCode() + ((this.f24688l.hashCode() + (((this.f24686l * 31) + (this.f24684l ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.f24689l;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f24685l;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final synchronized long yandex() {
        return this.f24685l;
    }

    public C12529l(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.f24685l = 0L;
        this.f24686l = i;
        this.f24688l = DesugarCollections.unmodifiableList(arrayList);
        this.f24687l = DesugarCollections.unmodifiableList(arrayList2);
        this.f24685l = j;
        this.f24689l = j2;
        this.f24684l = z;
    }
}
