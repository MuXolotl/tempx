package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؖۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4450l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9048l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public HashMap f9049l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ReadableByteChannel f9050l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ByteBuffer f9051l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ReadableByteChannel f9052l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f9053l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f9054l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ArrayList f9055l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9056l;

    public static C4450l billing(C13211l c13211l) throws IOException {
        C0883l c0883lSignatures;
        C13645l c13645l = new C13645l(0, (boolean) (0 == true ? 1 : 0));
        c13645l.f26671l = c13211l;
        c13645l.f26670l = new HashMap();
        ByteBuffer byteBuffer = c13211l.f25993l;
        long jPosition = byteBuffer.position();
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        while (true) {
            if ((hashSet.size() != 0 && i >= hashSet.size() * 500) || (c0883lSignatures = C13645l.signatures(c13211l)) == null) {
                break;
            }
            int i2 = c0883lSignatures.f2533l;
            ByteBuffer byteBuffer2 = c0883lSignatures.f2534l;
            if (byteBuffer2 != null && !hashSet.contains(Integer.valueOf(i2)) && (byteBuffer2.duplicate().getInt() & (-256)) == 256) {
                hashSet.add(Integer.valueOf(i2));
            }
            i++;
        }
        byteBuffer.position((int) jPosition);
        c13211l.f25991l = Math.max(c13211l.f25991l, byteBuffer.position());
        for (Integer num : hashSet) {
            num.getClass();
            ((HashMap) c13645l.f26670l).put(num, new C14448l(c13645l));
        }
        byteBuffer.position(0);
        c13211l.f25991l = Math.max(c13211l.f25991l, byteBuffer.position());
        Set<Integer> setKeySet = ((HashMap) c13645l.f26670l).keySet();
        C4450l c4450l = null;
        if (setKeySet.size() == 0) {
            C8339l.smaato("The MPEG TS stream contains no programs");
            return null;
        }
        for (Integer num2 : setKeySet) {
            num2.getClass();
            ReadableByteChannel readableByteChannel = (ReadableByteChannel) ((HashMap) c13645l.f26670l).get(num2);
            if (c4450l != null) {
                readableByteChannel.close();
            } else {
                C4450l c4450l2 = new C4450l();
                c4450l2.f9052l = readableByteChannel;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                byteBufferAllocate.position();
                while (readableByteChannel.read(byteBufferAllocate) != -1 && byteBufferAllocate.hasRemaining()) {
                }
                byteBufferAllocate.position();
                byteBufferAllocate.flip();
                c4450l2.f9051l = byteBufferAllocate;
                c4450l2.f9053l = byteBufferAllocate.remaining();
                c4450l2.f9048l = c4450l2.f9051l.getInt();
                c4450l2.f9056l = 4;
                HashMap map = new HashMap();
                c4450l2.f9049l = map;
                c4450l2.f9050l = readableByteChannel;
                c4450l2.f9055l = new ArrayList();
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && (i3 >= map.size() * 5 || map.size() >= 2)) {
                        break;
                    }
                    C2500l c2500lAdcel = c4450l2.adcel(c4450l2.vip());
                    if (c2500lAdcel == null) {
                        break;
                    }
                    c4450l2.yandex(c2500lAdcel);
                    i3++;
                }
                if (c4450l2.mopub().size() > 0) {
                    c4450l = c4450l2;
                } else {
                    readableByteChannel.close();
                }
            }
        }
        return c4450l;
    }

    public final C2500l adcel(ByteBuffer byteBuffer) {
        int i;
        C2500l c2500l;
        ReadableByteChannel readableByteChannel = this.f9052l;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        loop0: while (true) {
            int i2 = this.f9048l;
            if (i2 >= 445 && i2 <= 495) {
                ByteBuffer byteBufferDuplicate2 = byteBufferDuplicate.duplicate();
                ads(byteBufferDuplicate);
                this.f9051l.remaining();
                int i3 = byteBufferDuplicate2.getInt() & 255;
                int i4 = byteBufferDuplicate2.getShort() & 65535;
                long jLoadAd = -1;
                if (i3 != 191) {
                    byte b = byteBufferDuplicate2.get();
                    int i5 = b & 255;
                    i = 4096;
                    if ((b & 192) == 128) {
                        byte b2 = byteBufferDuplicate2.get();
                        int i6 = byteBufferDuplicate2.get() & 255;
                        int i7 = b2 & 192;
                        if (i7 == 128) {
                            jLoadAd = AbstractC6791l.Signature(byteBufferDuplicate2);
                            AbstractC16291l.billing(i6 - 5, byteBufferDuplicate2);
                        } else if (i7 == 192) {
                            jLoadAd = AbstractC6791l.Signature(byteBufferDuplicate2);
                            AbstractC6791l.Signature(byteBufferDuplicate2);
                            AbstractC16291l.billing(i6 - 10, byteBufferDuplicate2);
                        } else {
                            AbstractC16291l.billing(i6, byteBufferDuplicate2);
                        }
                        c2500l = new C2500l(i3, jLoadAd, i4);
                    } else {
                        while (i5 == 255) {
                            i5 = byteBufferDuplicate2.get() & 255;
                        }
                        if ((i5 & 192) == 64) {
                            byteBufferDuplicate2.get();
                            i5 = byteBufferDuplicate2.get() & 255;
                        }
                        int i8 = i5 & 240;
                        if (i8 == 32) {
                            jLoadAd = AbstractC6791l.loadAd(i5, byteBufferDuplicate2);
                        } else if (i8 == 48) {
                            jLoadAd = AbstractC6791l.loadAd(i5, byteBufferDuplicate2);
                            AbstractC6791l.Signature(byteBufferDuplicate2);
                        } else if (i5 != 15) {
                            C18073l.license("Invalid data");
                            return null;
                        }
                        c2500l = new C2500l(i3, jLoadAd, i4);
                    }
                } else {
                    i = 4096;
                    c2500l = new C2500l(i3, -1L, i4);
                }
                int i9 = c2500l.amazon;
                if (i9 == 0) {
                    do {
                        int i10 = this.f9048l;
                        if (i10 >= 445 && i10 <= 495) {
                            break;
                        }
                    } while (ads(byteBufferDuplicate));
                } else {
                    int iPosition = (i9 - byteBufferDuplicate.position()) + 6;
                    if (!this.f9054l) {
                        while (true) {
                            if (this.f9051l.hasRemaining()) {
                                int i11 = iPosition - 1;
                                if (iPosition == 0) {
                                    break;
                                }
                                byteBufferDuplicate.put((byte) (this.f9048l >>> 24));
                                this.f9048l = (this.f9048l << 8) | (this.f9051l.get() & 255);
                                iPosition = i11;
                            } else {
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                                byteBufferAllocate.position();
                                while (readableByteChannel.read(byteBufferAllocate) != -1 && byteBufferAllocate.hasRemaining()) {
                                }
                                byteBufferAllocate.position();
                                byteBufferAllocate.flip();
                                this.f9051l = byteBufferAllocate;
                                this.f9053l += (long) byteBufferAllocate.remaining();
                                if (!this.f9051l.hasRemaining()) {
                                    byteBufferDuplicate.putInt(this.f9048l);
                                    this.f9054l = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                byteBufferDuplicate2.limit(byteBufferDuplicate.position());
                c2500l.yandex = byteBufferDuplicate2;
                return c2500l;
            }
            if (this.f9054l) {
                break;
            }
            while (true) {
                if (this.f9051l.hasRemaining()) {
                    int i12 = (this.f9048l << 8) | (this.f9051l.get() & 255);
                    this.f9048l = i12;
                    if (i12 < 256 || i12 > 511) {
                    }
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4096);
                    byteBufferAllocate2.position();
                    while (readableByteChannel.read(byteBufferAllocate2) != -1 && byteBufferAllocate2.hasRemaining()) {
                    }
                    byteBufferAllocate2.position();
                    byteBufferAllocate2.flip();
                    this.f9051l = byteBufferAllocate2;
                    this.f9053l += (long) byteBufferAllocate2.remaining();
                    if (!this.f9051l.hasRemaining()) {
                        this.f9054l = true;
                        break loop0;
                    }
                }
            }
        }
        return null;
    }

    public final boolean ads(ByteBuffer byteBuffer) {
        int i;
        char c = 3;
        if (!this.f9054l) {
            int i2 = this.f9048l;
            int i3 = (i2 < 256 || i2 > 511) ? 0 : 1;
            int iPosition = byteBuffer.position();
            while (true) {
                if (this.f9051l.hasRemaining()) {
                    int i4 = this.f9048l;
                    if (i4 >= 256 && i4 <= 511) {
                        if (i3 == 0) {
                            c = 2;
                            break;
                        }
                        i3--;
                    }
                    if (!byteBuffer.hasRemaining()) {
                        c = 1;
                        break;
                    }
                    byteBuffer.put((byte) (this.f9048l >>> 24));
                    this.f9048l = (this.f9048l << 8) | (this.f9051l.get() & 255);
                } else {
                    ReadableByteChannel readableByteChannel = this.f9052l;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
                    byteBufferAllocate.position();
                    while (readableByteChannel.read(byteBufferAllocate) != -1 && byteBufferAllocate.hasRemaining()) {
                    }
                    byteBufferAllocate.position();
                    byteBufferAllocate.flip();
                    this.f9051l = byteBufferAllocate;
                    this.f9053l += (long) byteBufferAllocate.remaining();
                    if (!this.f9051l.hasRemaining()) {
                        if (byteBuffer.position() - iPosition > 0 && (i = this.f9048l) >= 256 && i <= 511) {
                            c = 2;
                            break;
                        }
                        while (true) {
                            if (this.f9056l > 0 && byteBuffer.hasRemaining()) {
                                byteBuffer.put((byte) (this.f9048l >>> 24));
                                int i5 = this.f9048l << 8;
                                this.f9048l = i5;
                                this.f9056l--;
                                if (i5 >= 256 && i5 <= 511) {
                                    c = 2;
                                    break;
                                }
                            } else {
                                if (this.f9056l != 0) {
                                    c = 1;
                                    break;
                                }
                                this.f9054l = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (c != 1) {
            return c == 2;
        }
        throw new BufferOverflowException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9050l.close();
    }

    public final ArrayList mopub() {
        ArrayList arrayList = new ArrayList();
        for (C13240l c13240l : this.f9049l.values()) {
            int i = c13240l.yandex;
            if ((i >= 192 && i <= 223) || i == 189 || i == 191) {
                arrayList.add(c13240l);
            }
        }
        return arrayList;
    }

    public final ByteBuffer vip() {
        synchronized (this.f9055l) {
            try {
                if (this.f9055l.size() <= 0) {
                    return ByteBuffer.allocate(65536);
                }
                return (ByteBuffer) this.f9055l.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(C2500l c2500l) {
        HashMap map = this.f9049l;
        int i = c2500l.crashlytics;
        C13240l c13240l = (C13240l) map.get(Integer.valueOf(i));
        if (c13240l == null) {
            C13240l c13240l2 = new C13240l();
            ArrayList arrayList = new ArrayList();
            c13240l2.loadAd = arrayList;
            c13240l2.crashlytics = this;
            c13240l2.yandex = i;
            arrayList.add(c2500l);
            map.put(Integer.valueOf(i), c13240l2);
            return;
        }
        ArrayList arrayList2 = c13240l.loadAd;
        if (arrayList2 != null) {
            arrayList2.add(c2500l);
            return;
        }
        C4450l c4450l = c13240l.crashlytics;
        ByteBuffer byteBuffer = c2500l.yandex;
        c4450l.getClass();
        byteBuffer.clear();
        synchronized (c4450l.f9055l) {
            c4450l.f9055l.add(byteBuffer);
        }
    }
}
