package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: lًؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7735l implements Iterable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C7362l f16231l = new C7362l(new byte[0]);

    public static AbstractC7735l amazon(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC7735l) it.next();
        }
        int i2 = i >>> 1;
        return amazon(it, i2).billing(amazon(it, i - i2));
    }

    public static C6769l vip() {
        return new C6769l();
    }

    public final byte[] Signature() {
        int size = size();
        if (size == 0) {
            return AbstractC3119l.yandex;
        }
        byte[] bArr = new byte[size];
        admob(bArr, 0, 0, size);
        return bArr;
    }

    public final String ad() {
        try {
            return pro();
        } catch (UnsupportedEncodingException e) {
            C18073l.Signature("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void admob(byte[] bArr, int i, int i2, int i3);

    public abstract int ads(int i, int i2, int i3);

    public abstract void advert(OutputStream outputStream, int i, int i2);

    public final AbstractC7735l billing(AbstractC7735l abstractC7735l) {
        int size = size();
        int size2 = abstractC7735l.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C8710l.f17918l;
        C8710l c8710l = this instanceof C8710l ? (C8710l) this : null;
        if (abstractC7735l.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC7735l;
        }
        int size3 = abstractC7735l.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC7735l.size();
            byte[] bArr = new byte[size4 + size5];
            mopub(bArr, 0, 0, size4);
            abstractC7735l.mopub(bArr, 0, size4, size5);
            return new C7362l(bArr);
        }
        if (c8710l != null) {
            AbstractC7735l abstractC7735l2 = c8710l.f17923l;
            if (abstractC7735l.size() + abstractC7735l2.size() < 128) {
                int size6 = abstractC7735l2.size();
                int size7 = abstractC7735l.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC7735l2.mopub(bArr2, 0, 0, size6);
                abstractC7735l.mopub(bArr2, 0, size6, size7);
                return new C8710l(c8710l.f17919l, new C7362l(bArr2));
            }
        }
        if (c8710l != null) {
            AbstractC7735l abstractC7735l3 = c8710l.f17923l;
            AbstractC7735l abstractC7735l4 = c8710l.f17919l;
            if (abstractC7735l4.firebase() > abstractC7735l3.firebase() && c8710l.f17924l > abstractC7735l.firebase()) {
                return new C8710l(abstractC7735l4, new C8710l(abstractC7735l3, abstractC7735l));
            }
        }
        if (size3 >= C8710l.f17918l[Math.max(firebase(), abstractC7735l.firebase()) + 1]) {
            return new C8710l(this, abstractC7735l);
        }
        C3316l c3316l = new C3316l(20);
        c3316l.firebase(this);
        c3316l.firebase(abstractC7735l);
        Stack stack = (Stack) c3316l.f7072l;
        AbstractC7735l c8710l2 = (AbstractC7735l) stack.pop();
        while (!stack.isEmpty()) {
            c8710l2 = new C8710l((AbstractC7735l) stack.pop(), c8710l2);
        }
        return c8710l2;
    }

    public abstract int firebase();

    public abstract int metrica(int i, int i2, int i3);

    public final void mopub(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            C18353l.mopub(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            C18353l.mopub(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            C18353l.mopub(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            C18353l.mopub(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            C18353l.mopub(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            admob(bArr, i, i2, i3);
        }
    }

    public abstract String pro();

    public abstract boolean remoteconfig();

    public abstract int size();

    public abstract boolean smaato();

    public abstract int tapsense();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
