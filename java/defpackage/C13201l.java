package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚْْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13201l {
    public static final C13975l loadAd;
    public final String yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public C13201l(String str) {
        this.yandex = str;
    }

    public static void adcel(FileChannel fileChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws IOException {
        C6356l.amazon();
        subscription(fileChannel, byteBuffer, byteBuffer.limit());
        ads(fileChannel, byteBuffer2);
    }

    public static void ads(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        if (AbstractC14375l.admob(fileChannel.position())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        HashMap map = EnumC2086l.f4674l;
        byteBufferAllocate.put("id3 ".getBytes(AbstractC12379l.yandex));
        byteBufferAllocate.putInt(byteBuffer.limit());
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
        fileChannel.write(byteBuffer);
    }

    public static void firebase(FileChannel fileChannel) {
        int i = AbstractC11306l.loadAd;
        fileChannel.position(i);
        int i2 = AbstractC11306l.crashlytics;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocateDirect.putInt((((int) fileChannel.size()) - i) - i2);
        byteBufferAllocateDirect.flip();
        fileChannel.write(byteBufferAllocateDirect);
    }

    public static boolean isPro(C7313l c7313l, FileChannel fileChannel) {
        if (c7313l.f15164l.f11507l.longValue() != fileChannel.size()) {
            return (c7313l.f15164l.f11507l.longValue() & 1) != 0 && c7313l.f15164l.f11507l.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static ByteBuffer loadAd(C7313l c7313l, C7313l c7313l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long jLongValue = !c7313l2.f15160l ? 0L : c7313l2.f15166l.f7144l.longValue() - c7313l2.f15166l.f7147l.longValue();
            if (jLongValue > 0 && (jLongValue & 1) != 0) {
                jLongValue++;
            }
            c7313l.f15166l.m1322case((int) jLongValue, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                byteArrayOutputStream = new ByteArrayOutputStream();
                c7313l.f15166l.m1322case(length, byteArrayOutputStream);
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            byteBufferWrap.rewind();
            return byteBufferWrap;
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    public static boolean subs(C7313l c7313l, FileChannel fileChannel) {
        if (c7313l.f15166l.f7144l.longValue() != fileChannel.size()) {
            return (c7313l.f15166l.f7144l.longValue() & 1) != 0 && c7313l.f15166l.f7144l.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static void subscription(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        if (AbstractC14375l.admob(fileChannel.position())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        HashMap map = EnumC2086l.f4674l;
        byteBufferAllocate.put("LIST".getBytes(AbstractC12379l.yandex));
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.flip();
        fileChannel.write(byteBufferAllocate);
        fileChannel.write(byteBuffer);
        if (AbstractC14375l.admob(j)) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
    }

    public static C10458l yandex(C7313l c7313l, FileChannel fileChannel) {
        C10458l c10458l = new C10458l(3);
        c10458l.loadAd = false;
        c10458l.crashlytics = false;
        c10458l.amazon = false;
        if (c7313l.f15164l.f11506l.longValue() < c7313l.f15166l.f7147l.longValue()) {
            c10458l.loadAd = true;
            if (Math.abs(c7313l.f15164l.f11507l.longValue() - c7313l.startapp()) <= 1) {
                c10458l.crashlytics = true;
                if (subs(c7313l, fileChannel)) {
                    c10458l.amazon = true;
                    return c10458l;
                }
            }
        } else if (Math.abs(c7313l.f15166l.f7144l.longValue() - c7313l.f15164l.f11506l.longValue()) <= 1) {
            c10458l.crashlytics = true;
            if (isPro(c7313l, fileChannel)) {
                c10458l.amazon = true;
            }
        }
        return c10458l;
    }

    public final C7313l admob(FileChannel fileChannel) {
        String str = this.yandex;
        try {
            return new C5325l(str).yandex(fileChannel);
        } catch (C13768l unused) {
            throw new C9511l("Failed to read file " + str);
        }
    }

    public final void amazon(C7313l c7313l, FileChannel fileChannel) throws IOException {
        C2047l c2047l;
        long jYandex = AbstractC2515l.yandex(c7313l);
        ArrayList arrayList = c7313l.f15163l;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                c2047l = null;
                break;
            } else {
                if (((C2047l) arrayList.get(i)).loadAd == jYandex) {
                    c2047l = (C2047l) arrayList.get(i - 1);
                    break;
                }
                i++;
            }
        }
        boolean zAdmob = AbstractC14375l.admob(c2047l.loadAd + c2047l.crashlytics + 8);
        C13975l c13975l = loadAd;
        if (zAdmob) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            Long l = c7313l.f15164l.f11506l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            fileChannel.truncate(c7313l.f15164l.f11506l.longValue());
            return;
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c7313l.f15164l.f11506l.longValue();
        c13975l.getClass();
        int i3 = C17500l.yandex;
        fileChannel.truncate(c7313l.f15164l.f11506l.longValue() - 1);
    }

    public final void billing(FileChannel fileChannel, C7313l c7313l, C16528l c16528l) {
        C5368l c5368l = c7313l.f15164l;
        mopub(fileChannel, c5368l.f11507l.intValue(), ((int) c16528l.f32303l) + 8);
    }

    public final ByteBuffer crashlytics(C7313l c7313l) {
        C13975l c13975l;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C5368l c5368l = c7313l.f15164l;
            ArrayList arrayListStartapp = c5368l.startapp();
            Collections.sort(arrayListStartapp, new C15696l(27));
            Iterator it = arrayListStartapp.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c13975l = loadAd;
                if (!zHasNext) {
                    break;
                }
                InterfaceC7988l interfaceC7988l = (InterfaceC7988l) ((InterfaceC4656l) it.next());
                EnumC1375l enumC1375lYandex = EnumC1375l.yandex(EnumC17969l.valueOf(interfaceC7988l.getId()));
                byteArrayOutputStream.write(enumC1375lYandex.f3505l.getBytes(AbstractC12379l.yandex));
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                interfaceC7988l.admob();
                c13975l.getClass();
                int i = C17500l.yandex;
                byte[] bytes = interfaceC7988l.admob().getBytes(AbstractC12379l.crashlytics);
                byteArrayOutputStream.write(AbstractC14375l.billing(bytes.length));
                byteArrayOutputStream.write(bytes);
                if (AbstractC14375l.admob(bytes.length)) {
                    byteArrayOutputStream.write(0);
                }
                if (enumC1375lYandex == EnumC1375l.TRACKNO) {
                    C6356l.amazon();
                }
            }
            for (InterfaceC7988l interfaceC7988l2 : c5368l.f11508l) {
                byteArrayOutputStream.write(interfaceC7988l2.getId().getBytes(AbstractC12379l.yandex));
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                interfaceC7988l2.getId();
                interfaceC7988l2.admob();
                c13975l.getClass();
                int i2 = C17500l.yandex;
                byte[] bytes2 = interfaceC7988l2.admob().getBytes(AbstractC12379l.crashlytics);
                byteArrayOutputStream.write(AbstractC14375l.billing(bytes2.length));
                byteArrayOutputStream.write(bytes2);
                if (AbstractC14375l.admob(bytes2.length)) {
                    byteArrayOutputStream.write(0);
                }
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            byteBufferWrap.rewind();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AbstractC11306l.loadAd);
            HashMap map = EnumC2086l.f4674l;
            byteBufferAllocate.put("INFO".getBytes(AbstractC12379l.yandex));
            byteBufferAllocate.flip();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferAllocate.limit() + byteBufferWrap.limit());
            byteBufferAllocateDirect.put(byteBufferAllocate);
            byteBufferAllocateDirect.put(byteBufferWrap);
            byteBufferAllocateDirect.flip();
            return byteBufferAllocateDirect;
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    public final C16528l metrica(C7313l c7313l, FileChannel fileChannel) {
        fileChannel.position(c7313l.startapp());
        C16528l c16528l = new C16528l(ByteOrder.LITTLE_ENDIAN);
        c16528l.billing(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        HashMap map = EnumC2086l.f4674l;
        if ("id3 ".equals((String) c16528l.f32302l)) {
            return c16528l;
        }
        throw new C9511l(AbstractC0653l.ads(new StringBuilder(), this.yandex, " Unable to find ID3 chunk at original location has file been modified externally"));
    }

    public final void mopub(FileChannel fileChannel, int i, int i2) {
        fileChannel.position(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) C6356l.amazon().adcel);
        while (true) {
            if (fileChannel.read(byteBufferAllocate) < 0 && byteBufferAllocate.position() == 0) {
                long size = fileChannel.size() - ((long) i2);
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                loadAd.getClass();
                int i3 = C17500l.yandex;
                fileChannel.truncate(size);
                return;
            }
            byteBufferAllocate.flip();
            long jPosition = fileChannel.position();
            fileChannel.position((jPosition - ((long) i2)) - ((long) byteBufferAllocate.limit()));
            fileChannel.write(byteBufferAllocate);
            fileChannel.position(jPosition);
            byteBufferAllocate.compact();
        }
    }

    public final void purchase(FileChannel fileChannel, C7313l c7313l, C16528l c16528l) {
        mopub(fileChannel, (int) c7313l.admob(), ((int) c16528l.f32303l) + 8);
    }

    public final void remoteconfig(C7313l c7313l, FileChannel fileChannel, C7313l c7313l2) {
        if (c7313l.billing() instanceof C5368l) {
            if (c7313l2.f15160l) {
                vip(c7313l, fileChannel, c7313l2);
                return;
            } else {
                smaato(c7313l, fileChannel, c7313l2);
                return;
            }
        }
        if (c7313l2.f15165l) {
            vip(c7313l, fileChannel, c7313l2);
        } else {
            smaato(c7313l, fileChannel, c7313l2);
        }
    }

    public final void smaato(C7313l c7313l, FileChannel fileChannel, C7313l c7313l2) {
        boolean z = c7313l.billing() instanceof C5368l;
        String str = this.yandex;
        if (!z) {
            ByteBuffer byteBufferLoadAd = loadAd(c7313l, c7313l2);
            if (c7313l2.f15162l) {
                if (!AbstractC2515l.loadAd(c7313l2)) {
                    throw new C9511l(AbstractC12900l.firebase(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                amazon(c7313l2, fileChannel);
                fileChannel.position(fileChannel.size());
                ads(fileChannel, byteBufferLoadAd);
                return;
            }
            if (c7313l2.f15165l) {
                C16528l c16528lStartapp = startapp(c7313l2, fileChannel);
                if (isPro(c7313l2, fileChannel)) {
                    fileChannel.truncate(c7313l2.f15164l.f11506l.longValue());
                } else {
                    billing(fileChannel, c7313l2, c16528lStartapp);
                }
            }
            if (!c7313l2.f15160l) {
                fileChannel.position(fileChannel.size());
                ads(fileChannel, byteBufferLoadAd);
                return;
            }
            C16528l c16528lMetrica = metrica(c7313l2, fileChannel);
            if (subs(c7313l2, fileChannel)) {
                ads(fileChannel, byteBufferLoadAd);
                return;
            }
            purchase(fileChannel, c7313l2, c16528lMetrica);
            fileChannel.position(fileChannel.size());
            ads(fileChannel, byteBufferLoadAd);
            return;
        }
        ByteBuffer byteBufferCrashlytics = crashlytics(c7313l);
        long jLimit = byteBufferCrashlytics.limit();
        if (c7313l2.f15162l) {
            if (!AbstractC2515l.loadAd(c7313l2)) {
                throw new C9511l(AbstractC12900l.firebase(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
            }
            amazon(c7313l2, fileChannel);
            fileChannel.position(fileChannel.size());
            subscription(fileChannel, byteBufferCrashlytics, jLimit);
            return;
        }
        if (c7313l2.f15160l) {
            if (subs(c7313l2, fileChannel)) {
                fileChannel.truncate(c7313l2.startapp());
            } else {
                purchase(fileChannel, c7313l2, metrica(c7313l2, fileChannel));
            }
        }
        if (!c7313l2.f15165l) {
            fileChannel.position(fileChannel.size());
            subscription(fileChannel, byteBufferCrashlytics, jLimit);
            return;
        }
        C16528l c16528lStartapp2 = startapp(c7313l2, fileChannel);
        if (!isPro(c7313l2, fileChannel)) {
            billing(fileChannel, c7313l2, c16528lStartapp2);
            fileChannel.position(fileChannel.size());
            subscription(fileChannel, byteBufferCrashlytics, byteBufferCrashlytics.limit());
            return;
        }
        C5368l c5368l = c7313l2.f15164l;
        long jLimit2 = byteBufferCrashlytics.limit();
        if (c5368l.tapsense() < jLimit2) {
            subscription(fileChannel, byteBufferCrashlytics, jLimit2);
            return;
        }
        subscription(fileChannel, byteBufferCrashlytics, c5368l.tapsense());
        if (c5368l.tapsense() > jLimit2) {
            fileChannel.write(ByteBuffer.allocateDirect((int) (c5368l.tapsense() - jLimit2)));
        }
    }

    public final C16528l startapp(C7313l c7313l, FileChannel fileChannel) {
        fileChannel.position(c7313l.f15164l.f11506l.longValue());
        C16528l c16528l = new C16528l(ByteOrder.LITTLE_ENDIAN);
        c16528l.billing(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        HashMap map = EnumC2086l.f4674l;
        if ("LIST".equals((String) c16528l.f32302l)) {
            return c16528l;
        }
        throw new C9511l(AbstractC0653l.ads(new StringBuilder(), this.yandex, " Unable to find List chunk at original location has file been modified externally"));
    }

    public final void vip(C7313l c7313l, FileChannel fileChannel, C7313l c7313l2) {
        ByteBuffer byteBufferCrashlytics = crashlytics(c7313l);
        ByteBuffer byteBufferLoadAd = loadAd(c7313l, c7313l2);
        boolean z = c7313l2.f15165l;
        String str = this.yandex;
        if (z && c7313l2.f15160l) {
            if (c7313l2.f15162l) {
                if (!AbstractC2515l.loadAd(c7313l2)) {
                    throw new C9511l(AbstractC12900l.firebase(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                amazon(c7313l2, fileChannel);
                fileChannel.position(fileChannel.size());
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                return;
            }
            C10458l c10458lYandex = yandex(c7313l2, fileChannel);
            if (!c10458lYandex.crashlytics || !c10458lYandex.amazon) {
                C16528l c16528lStartapp = startapp(c7313l2, fileChannel);
                C16528l c16528lMetrica = metrica(c7313l2, fileChannel);
                billing(fileChannel, c7313l2, c16528lStartapp);
                purchase(fileChannel, c7313l2, c16528lMetrica);
                fileChannel.position(fileChannel.size());
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                return;
            }
            if (c10458lYandex.loadAd) {
                startapp(c7313l2, fileChannel);
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                fileChannel.truncate(fileChannel.position());
                return;
            } else {
                metrica(c7313l2, fileChannel);
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                fileChannel.truncate(fileChannel.position());
                return;
            }
        }
        if (z && !c7313l2.f15160l) {
            if (c7313l2.f15162l) {
                if (!AbstractC2515l.loadAd(c7313l2)) {
                    throw new C9511l(AbstractC12900l.firebase(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                amazon(c7313l2, fileChannel);
                fileChannel.position(fileChannel.size());
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                return;
            }
            C16528l c16528lStartapp2 = startapp(c7313l2, fileChannel);
            if (isPro(c7313l2, fileChannel)) {
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                fileChannel.truncate(fileChannel.position());
                return;
            } else {
                billing(fileChannel, c7313l2, c16528lStartapp2);
                fileChannel.position(fileChannel.size());
                adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
                return;
            }
        }
        if (!c7313l2.f15160l || z) {
            fileChannel.position(fileChannel.size());
            adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
            return;
        }
        if (c7313l2.f15162l) {
            if (!AbstractC2515l.loadAd(c7313l2)) {
                throw new C9511l(AbstractC12900l.firebase(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
            }
            amazon(c7313l2, fileChannel);
            fileChannel.position(fileChannel.size());
            adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
            return;
        }
        C16528l c16528lMetrica2 = metrica(c7313l2, fileChannel);
        if (subs(c7313l2, fileChannel)) {
            adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
            fileChannel.truncate(fileChannel.position());
        } else {
            purchase(fileChannel, c7313l2, c16528lMetrica2);
            fileChannel.position(fileChannel.size());
            adcel(fileChannel, byteBufferCrashlytics, byteBufferLoadAd);
        }
    }
}
