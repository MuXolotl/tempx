package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔۤۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15295l extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29894l;

    public /* synthetic */ C15295l(int i) {
        this.f29894l = i;
    }

    private final synchronized void adcel() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
        ((ByteArrayOutputStream) this).count = 0;
    }

    private final synchronized void ads() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
        ((ByteArrayOutputStream) this).count = 0;
    }

    public synchronized byte[] billing(C1438l c1438l) {
        byte[] bArr;
        bArr = new byte[64];
        byte[] bArr2 = ((ByteArrayOutputStream) this).buf;
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr3 = new byte[32];
        AbstractC13041l.purchase(c1438l.yandex().f13200l, bArr3, 0);
        AbstractC13041l.mopub(c1438l.f3621l, bArr3, (byte) 0, bArr2, i, bArr);
        reset();
        return bArr;
    }

    public synchronized boolean isVip(C6254l c6254l, byte[] bArr) {
        if (64 != bArr.length) {
            reset();
            return false;
        }
        boolean zAdmob = AbstractC13041l.admob(bArr, c6254l.f13200l, (byte) 0, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
        reset();
        return zAdmob;
    }

    public synchronized byte[] mopub(C9298l c9298l, byte[] bArr) {
        byte[] bArr2;
        bArr2 = new byte[114];
        c9298l.loadAd(bArr, ((ByteArrayOutputStream) this).count, ((ByteArrayOutputStream) this).buf, bArr2);
        reset();
        return bArr2;
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized void reset() {
        switch (this.f29894l) {
            case 1:
                adcel();
                break;
            case 2:
                ads();
                break;
            default:
                super.reset();
                break;
        }
    }

    public synchronized boolean signatures(C11104l c11104l, byte[] bArr, byte[] bArr2) {
        if (114 != bArr2.length) {
            reset();
            return false;
        }
        byte[] bArr3 = ((ByteArrayOutputStream) this).buf;
        int i = ((ByteArrayOutputStream) this).count;
        c11104l.getClass();
        if (bArr == null) {
            throw new NullPointerException("'ctx' cannot be null");
        }
        if (bArr.length > 255) {
            throw new IllegalArgumentException("ctx");
        }
        boolean zAdmob = AbstractC15960l.admob(bArr2, c11104l.f22309l, bArr, (byte) 0, bArr3, i);
        reset();
        return zAdmob;
    }

    public byte[] vip() {
        switch (this.f29894l) {
            case 0:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((ByteArrayOutputStream) this).buf;
    }

    public void yandex() {
        Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
    }
}
