package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: renamed from: lًۥۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8398l {
    public static final C13975l loadAd;
    public C17925l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static void admob(long j, FileChannel fileChannel, FileChannel fileChannel2, C8117l c8117l) throws IOException {
        long jPosition = c8117l.crashlytics - fileChannel.position();
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), jPosition);
        fileChannel2.position(fileChannel2.position() + jPosition);
        C15599l c15599l = new C15599l(c8117l.yandex());
        fileChannel2.write(((C8117l) c15599l.f33215l).crashlytics());
        fileChannel2.write((ByteBuffer) c15599l.f33214l);
        fileChannel.position(c8117l.loadAd());
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j - fileChannel.position());
    }

    public static void billing(FileChannel fileChannel, FileChannel fileChannel2) throws C9511l, IOException {
        long size = fileChannel.size() - fileChannel.position();
        long j = C6356l.amazon().adcel;
        long j2 = size / j;
        long j3 = size % j;
        long jTransferFrom = 0;
        for (int i = 0; i < j2; i++) {
            jTransferFrom = fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j) + jTransferFrom;
            fileChannel2.position(fileChannel2.position() + j);
        }
        if (j3 > 0) {
            long jTransferFrom2 = fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j3) + jTransferFrom;
            if (jTransferFrom2 != size) {
                throw new C9511l(AbstractC15560l.ads(jTransferFrom2, " bytes", AbstractC0653l.Signature(size, "Was meant to write ", " bytes but only written ")));
            }
        }
    }

    public static boolean crashlytics(int i, boolean z, int i2, List list, C8117l c8117l, C8117l c8117l2) {
        if (c8117l2.crashlytics <= c8117l.crashlytics) {
            return false;
        }
        if (z && (i - 8 >= i2 || i == i2)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C18319l) it.next()).m4522l(i2);
        }
        return true;
    }

    public static void loadAd(C8117l c8117l, ByteBuffer byteBuffer, int i, C8117l c8117l2, C8117l c8117l3) {
        c8117l.purchase(c8117l.loadAd + i);
        if (c8117l2 != null) {
            c8117l2.purchase(c8117l2.loadAd + i);
            byteBuffer.position((int) ((c8117l2.crashlytics - c8117l.crashlytics) - 8));
            byteBuffer.put(c8117l2.crashlytics());
        }
        if (c8117l3 != null) {
            c8117l3.purchase(c8117l3.loadAd + i);
            byteBuffer.position((int) ((c8117l3.crashlytics - c8117l.crashlytics) - 8));
            byteBuffer.put(c8117l3.crashlytics());
        }
    }

    public static void mopub(FileChannel fileChannel, FileChannel fileChannel2, C8117l c8117l, ByteBuffer byteBuffer) throws IOException {
        fileChannel.position(0L);
        fileChannel2.transferFrom(fileChannel, 0L, c8117l.crashlytics);
        fileChannel2.position(c8117l.crashlytics);
        fileChannel2.write(byteBuffer);
        fileChannel.position(c8117l.loadAd());
    }

    public static void purchase(FileChannel fileChannel, FileChannel fileChannel2, C8117l c8117l) throws C9511l, IOException {
        if (c8117l == null) {
            billing(fileChannel, fileChannel2);
            return;
        }
        long jPosition = c8117l.crashlytics - fileChannel.position();
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), jPosition);
        fileChannel2.position(fileChannel2.position() + jPosition);
        C15599l c15599l = new C15599l(c8117l.yandex());
        fileChannel2.write(((C8117l) c15599l.f33215l).crashlytics());
        fileChannel2.write((ByteBuffer) c15599l.f33214l);
        fileChannel.position(c8117l.loadAd());
        billing(fileChannel, fileChannel2);
    }

    public static void yandex(FileChannel fileChannel, FileChannel fileChannel2, int i, int i2) throws IOException {
        int i3 = i - 8;
        C13975l c13975l = loadAd;
        if (i3 < i2) {
            if (i == i2) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
                fileChannel.position(fileChannel.position() + ((long) i));
                return;
            }
            return;
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i5 = C17500l.yandex;
        C15599l c15599l = new C15599l(i3 - i2);
        fileChannel2.write(((C8117l) c15599l.f33215l).crashlytics());
        fileChannel2.write((ByteBuffer) c15599l.f33214l);
        fileChannel.position(fileChannel.position() + ((long) i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:104:0x023c  */
    /* JADX WARN: Code duplicated, block: B:106:0x026a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x028e  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ba A[LOOP:3: B:112:0x02b4->B:114:0x02ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x030d  */
    /* JADX WARN: Code duplicated, block: B:119:0x033c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0364  */
    /* JADX WARN: Code duplicated, block: B:123:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:126:0x0411  */
    /* JADX WARN: Code duplicated, block: B:128:0x041b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0427  */
    /* JADX WARN: Code duplicated, block: B:132:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0513  */
    /* JADX WARN: Code duplicated, block: B:140:0x051b  */
    /* JADX WARN: Code duplicated, block: B:142:0x054b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0557  */
    /* JADX WARN: Code duplicated, block: B:145:0x0573  */
    /* JADX WARN: Code duplicated, block: B:152:0x0597 A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:154:0x059d A[Catch: all -> 0x060c, Exception -> 0x060f, TRY_LEAVE, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:157:0x05a7 A[Catch: all -> 0x060c, Exception -> 0x060f, TRY_ENTER, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:159:0x05af A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:161:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:164:0x05c3 A[Catch: all -> 0x060c, Exception -> 0x060f, TRY_LEAVE, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:167:0x05de A[Catch: all -> 0x060c, Exception -> 0x060f, TRY_ENTER, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:169:0x05f0 A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0612 A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0641  */
    /* JADX WARN: Code duplicated, block: B:186:0x0668 A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:188:0x066e A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0674 A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:192:0x067c A[Catch: all -> 0x060c, Exception -> 0x060f, TryCatch #0 {Exception -> 0x060f, blocks: (B:150:0x058c, B:152:0x0597, B:154:0x059d, B:157:0x05a7, B:159:0x05af, B:162:0x05bd, B:164:0x05c3, B:167:0x05de, B:169:0x05f0, B:178:0x0619, B:170:0x05f2, B:171:0x060b, B:176:0x0612, B:179:0x061e, B:180:0x0635, B:184:0x0643, B:185:0x0667, B:186:0x0668, B:187:0x066d, B:188:0x066e, B:189:0x0673, B:190:0x0674, B:191:0x067b, B:192:0x067c, B:193:0x0683), top: B:211:0x058c }] */
    /* JADX WARN: Code duplicated, block: B:231:0x061e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0619 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void amazon(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        C8201l c8201l;
        FileChannel fileChannel;
        int iLoadAd;
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        ArrayList arrayList;
        int i4;
        C8117l c8117l;
        int i5;
        int i6;
        int i7;
        C8117l c8117l2;
        C8117l c8117l3;
        int i8;
        boolean z;
        C8201l c8201l2;
        int i9;
        ArrayList arrayList2;
        FileChannel fileChannel2;
        C8117l c8117l4;
        ByteBuffer byteBuffer;
        FileChannel fileChannel3;
        C8117l c8117l5;
        int i10;
        int i11;
        int i12;
        C8117l c8117l6;
        int i13;
        boolean z2;
        int i14;
        boolean zCrashlytics;
        long jLoadAd;
        long jLoadAd2;
        boolean zCrashlytics2;
        long jLoadAd3;
        boolean zCrashlytics3;
        int i15;
        int iLimit;
        int i16;
        int i17;
        int i18;
        Iterator it;
        FileChannel fileChannel4;
        FileChannel fileChannel5;
        RandomAccessFile randomAccessFile3;
        C8201l c8201l3;
        C8117l c8117lLoadAd;
        ArrayList arrayList3;
        int i19;
        int i20;
        C18319l c18319l;
        C18319l c18319l2;
        int i21;
        int i22;
        long j3;
        long j4;
        Iterator it2;
        boolean z3;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i23 = C17500l.yandex;
        FileChannel channel = randomAccessFile.getChannel();
        FileChannel channel2 = randomAccessFile2.getChannel();
        try {
            C8201l c8201l4 = new C8201l(randomAccessFile);
            ArrayList arrayList4 = c8201l4.isPro;
            C8117l c8117lLoadAd2 = C8201l.loadAd(c8201l4.crashlytics);
            if (c8117lLoadAd2 == null) {
                throw new C9511l("Unable to make changes to Mp4 file, unable to determine start of audio");
            }
            ByteBuffer byteBufferBilling = this.yandex.billing(interfaceC13280l, 0);
            byteBufferBilling.rewind();
            int iLimit2 = byteBufferBilling.limit();
            C8117l c8117lLoadAd3 = C8201l.loadAd(c8201l4.loadAd);
            C8117l c8117lLoadAd4 = C8201l.loadAd(c8201l4.amazon);
            C8117l c8117lLoadAd5 = C8201l.loadAd(c8201l4.mopub);
            C8117l c8117lLoadAd6 = C8201l.loadAd(c8201l4.purchase);
            C8117l c8117lLoadAd7 = C8201l.loadAd(c8201l4.admob);
            C8117l c8117lLoadAd8 = C8201l.loadAd(c8201l4.billing);
            C8117l c8117lLoadAd9 = C8201l.loadAd((C17701l) AbstractC14814l.firebase(1, c8201l4.smaato));
            if (c8117lLoadAd5 == null) {
                c8201l = c8201l4;
                fileChannel = channel2;
                if (c8117lLoadAd6 != null) {
                    int iLoadAd2 = (int) c8117lLoadAd9.loadAd();
                    i2 = iLoadAd2;
                    j = iLoadAd2;
                    j2 = c8117lLoadAd3.crashlytics;
                    i = (int) (j - (j2 + 8));
                    iLoadAd = i2;
                } else {
                    iLoadAd = (int) c8117lLoadAd3.loadAd();
                    i = c8117lLoadAd3.loadAd - 8;
                }
                i3 = 0;
            } else if (c8117lLoadAd6 == null) {
                c8201l = c8201l4;
                fileChannel = channel2;
                i = c8117lLoadAd3.loadAd - 8;
                iLoadAd = (int) c8117lLoadAd3.loadAd();
                i3 = 0;
            } else if (c8117lLoadAd4 != null) {
                int i24 = c8117lLoadAd4.loadAd;
                c8201l = c8201l4;
                int i25 = (int) c8117lLoadAd4.crashlytics;
                fileChannel = channel2;
                i = (int) (((long) i25) - (c8117lLoadAd3.crashlytics + 8));
                iLoadAd = i25;
                i3 = i24;
            } else {
                c8201l = c8201l4;
                fileChannel = channel2;
                if (c8117lLoadAd7 != null) {
                    int iLoadAd3 = (int) c8117lLoadAd7.loadAd();
                    i2 = iLoadAd3;
                    j = iLoadAd3;
                    j2 = c8117lLoadAd3.crashlytics;
                } else {
                    int i26 = ((int) c8117lLoadAd6.crashlytics) + 12;
                    i2 = i26;
                    j = i26;
                    j2 = c8117lLoadAd3.crashlytics;
                }
                i = (int) (j - (j2 + 8));
                iLoadAd = i2;
                i3 = 0;
            }
            Iterator it3 = arrayList4.iterator();
            while (true) {
                arrayList = arrayList4;
                if (!it3.hasNext()) {
                    i4 = iLoadAd;
                    c8117l = c8117lLoadAd8;
                    i5 = 0;
                    break;
                }
                C17701l c17701l = (C17701l) it3.next();
                i4 = iLoadAd;
                C17701l c17701l2 = c17701l.f34488l;
                C17701l c17701l3 = null;
                if (c17701l2 == null) {
                    it2 = it3;
                    c8117l = c8117lLoadAd8;
                } else {
                    it2 = it3;
                    int iIndexOf = !c17701l2.crashlytics(c17701l) ? -1 : c17701l2.f34487l.indexOf(c17701l);
                    c8117l = c8117lLoadAd8;
                    if (iIndexOf == -1) {
                        C8339l.metrica("argument is not a child");
                        return;
                    } else if (iIndexOf > 0) {
                        int i27 = iIndexOf - 1;
                        Vector vector = c17701l2.f34487l;
                        if (vector == null) {
                            throw new ArrayIndexOutOfBoundsException("node has no children");
                        }
                        c17701l3 = (C17701l) vector.elementAt(i27);
                    }
                }
                C17701l c17701l4 = c17701l3;
                if (c17701l4 != null) {
                    if (c17701l4 == c17701l) {
                        z3 = true;
                    } else {
                        C17701l c17701l5 = c17701l.f34488l;
                        z3 = c17701l5 != null && c17701l5 == c17701l4.f34488l;
                        if (z3 && !c17701l5.crashlytics(c17701l4)) {
                            throw new Error("sibling has different parent");
                        }
                    }
                    if (!z3) {
                        throw new Error("child of parent is not a sibling");
                    }
                }
                if (!(c17701l2.f34488l == null)) {
                    C8117l c8117l7 = (C8117l) c17701l2.f34486l;
                    C8117l c8117l8 = (C8117l) c17701l.f34486l;
                    if (c17701l4 != null) {
                        C8117l c8117l9 = (C8117l) c17701l4.f34486l;
                        String str = c8117l7.yandex;
                        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
                        if (str.equals("meta") && c8117l9.yandex.equals("ilst")) {
                            i5 = c8117l8.loadAd;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                arrayList4 = arrayList;
                iLoadAd = i4;
                c8117lLoadAd8 = c8117l;
                it3 = it2;
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    i6 = 0;
                    i7 = 0;
                    break;
                }
                C17701l c17701l6 = (C17701l) it4.next();
                if (c17701l6.f34488l.f34488l == null) {
                    C8117l c8117l10 = (C8117l) c17701l6.f34486l;
                    int i28 = c8117l10.loadAd;
                    i6 = (int) c8117l10.crashlytics;
                    i7 = i28;
                    break;
                }
            }
            long j5 = c8117lLoadAd2.crashlytics;
            try {
                try {
                    try {
                        if (i7 > 0) {
                            c8117l2 = c8117lLoadAd5;
                            c8117l3 = c8117lLoadAd6;
                            long j6 = i6;
                            if (j6 > j5 || j6 < c8117lLoadAd3.crashlytics) {
                                i8 = i6;
                                z = false;
                            }
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i29 = C17500l.yandex;
                            c8201l2 = c8201l;
                            i9 = i8;
                            arrayList2 = c8201l2.remoteconfig;
                            if (i3 == iLimit2) {
                                c13975l.getClass();
                                channel.position(0L);
                                FileChannel fileChannel6 = fileChannel;
                                fileChannel6.transferFrom(channel, 0L, c8117lLoadAd4.crashlytics);
                                fileChannel6.position(c8117lLoadAd4.crashlytics);
                                fileChannel6.write(byteBufferBilling);
                                channel.position(c8117lLoadAd4.loadAd());
                                purchase(channel, fileChannel6, c8117l);
                                fileChannel4 = fileChannel6;
                            } else {
                                fileChannel2 = fileChannel;
                                c8117l4 = c8117l;
                                byteBuffer = c8201l2.vip;
                                if (i3 > iLimit2) {
                                    c13975l.getClass();
                                    i15 = (int) (c8117lLoadAd4.crashlytics - (c8117lLoadAd3.crashlytics + 8));
                                    iLimit = byteBufferBilling.limit();
                                    i16 = c8117lLoadAd4.loadAd;
                                    if (i5 > 0) {
                                        mopub(channel, fileChannel2, c8117lLoadAd4, byteBufferBilling);
                                        C15599l c15599l = new C15599l(((c8117lLoadAd4.loadAd - iLimit) + i5) - 8);
                                        fileChannel2.write(((C8117l) c15599l.f33215l).crashlytics());
                                        fileChannel2.write((ByteBuffer) c15599l.f33214l);
                                        channel.position(channel.position() + ((long) i5));
                                        purchase(channel, fileChannel2, c8117l4);
                                    } else {
                                        i17 = (i16 - iLimit) - 8;
                                        if (i17 > 0) {
                                            mopub(channel, fileChannel2, c8117lLoadAd4, byteBufferBilling);
                                            C15599l c15599l2 = new C15599l(i17);
                                            fileChannel2.write(((C8117l) c15599l2.f33215l).crashlytics());
                                            fileChannel2.write((ByteBuffer) c15599l2.f33214l);
                                            purchase(channel, fileChannel2, c8117l4);
                                        } else {
                                            i18 = i16 - iLimit;
                                            channel.position(0L);
                                            FileChannel fileChannel7 = fileChannel2;
                                            fileChannel7.transferFrom(channel, 0L, c8117lLoadAd3.crashlytics);
                                            fileChannel7.position(c8117lLoadAd3.crashlytics);
                                            if (c8117lLoadAd2.crashlytics > c8117lLoadAd3.crashlytics) {
                                                it = arrayList2.iterator();
                                                while (it.hasNext()) {
                                                    ((C18319l) it.next()).m4522l(-i18);
                                                }
                                            }
                                            loadAd(c8117lLoadAd3, byteBuffer, -i18, c8117l2, c8117l3);
                                            fileChannel7.write(c8117lLoadAd3.crashlytics());
                                            byteBuffer.rewind();
                                            byteBuffer.limit(i15);
                                            fileChannel7.write(byteBuffer);
                                            fileChannel7.write(byteBufferBilling);
                                            byteBuffer.limit(byteBuffer.capacity());
                                            byteBuffer.position(i15 + c8117lLoadAd4.loadAd);
                                            fileChannel7.write(byteBuffer);
                                            channel.position(c8117lLoadAd3.loadAd() + ((long) i18));
                                            purchase(channel, fileChannel7, c8117l4);
                                            fileChannel4 = fileChannel7;
                                        }
                                    }
                                    fileChannel4 = fileChannel2;
                                } else {
                                    fileChannel3 = fileChannel2;
                                    c8117l5 = c8117l3;
                                    i10 = iLimit2 - i3;
                                    if (i10 <= i5 - 8) {
                                        c13975l.getClass();
                                        mopub(channel, fileChannel3, c8117lLoadAd4, byteBufferBilling);
                                        C15599l c15599l3 = new C15599l((i5 - i10) - 8);
                                        fileChannel3.write(((C8117l) c15599l3.f33215l).crashlytics());
                                        fileChannel3.write((ByteBuffer) c15599l3.f33214l);
                                        channel.position(channel.position() + ((long) i5));
                                        purchase(channel, fileChannel3, c8117l4);
                                        fileChannel4 = fileChannel3;
                                    } else {
                                        i11 = i10 - i5;
                                        channel.position(0L);
                                        i12 = i5;
                                        c8117l6 = c8117l2;
                                        i13 = i7;
                                        fileChannel3.transferFrom(channel, 0L, c8117lLoadAd3.crashlytics);
                                        fileChannel3.position(c8117lLoadAd3.crashlytics);
                                        if (c8117l6 == null) {
                                            z2 = z;
                                            i14 = i3;
                                            if (c8117l5 == null) {
                                                c13975l.getClass();
                                                jLoadAd2 = c8117lLoadAd3.loadAd();
                                                int iLimit3 = byteBufferBilling.limit();
                                                int iYandex = c8117lLoadAd3.yandex();
                                                int i30 = c8117l6.loadAd;
                                                int iYandex2 = c8117l6.yandex();
                                                C7467l c7467lM2188l = C7467l.m2188l();
                                                int i31 = ((C8117l) c7467lM2188l.f33215l).loadAd + iLimit3;
                                                EnumC8101l enumC8101l2 = EnumC8101l.UNKNOWN;
                                                C8117l c8117l11 = new C8117l("meta");
                                                c8117l11.purchase(i31 + 12);
                                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                                C8117l c8117l12 = new C8117l("udta");
                                                c8117l12.purchase(c8117l11.loadAd + 8 + iYandex2);
                                                int iYandex3 = c8117l12.yandex() - iYandex2;
                                                zCrashlytics2 = crashlytics(i13, z2, iYandex3, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                                c8117lLoadAd3.purchase(c8117lLoadAd3.loadAd + iYandex3);
                                                fileChannel3.write(c8117lLoadAd3.crashlytics());
                                                byteBuffer.rewind();
                                                byteBuffer.limit(iYandex - i30);
                                                fileChannel3.write(byteBuffer);
                                                fileChannel3.write(c8117l12.crashlytics());
                                                if (byteBuffer.position() + 8 < byteBuffer.capacity()) {
                                                    byteBuffer.limit(byteBuffer.capacity());
                                                    byteBuffer.position(byteBuffer.position() + 8);
                                                    fileChannel3.write(byteBuffer);
                                                }
                                                fileChannel3.write(c8117l11.crashlytics());
                                                fileChannel3.write(byteBufferAllocate);
                                                fileChannel3.write(((C8117l) c7467lM2188l.f33215l).crashlytics());
                                                fileChannel3.write((ByteBuffer) c7467lM2188l.f33214l);
                                                fileChannel3.write(byteBufferBilling);
                                                channel.position(i4 + i14 + i12);
                                                if (c8117l4 != null) {
                                                    admob(jLoadAd2, channel, fileChannel3, c8117l4);
                                                } else {
                                                    long jPosition = jLoadAd2 - channel.position();
                                                    fileChannel3.transferFrom(channel, fileChannel3.position(), jPosition);
                                                    fileChannel3.position(fileChannel3.position() + jPosition);
                                                }
                                                if (!zCrashlytics2) {
                                                    yandex(channel, fileChannel3, i9, i11);
                                                }
                                                billing(channel, fileChannel3);
                                                fileChannel4 = fileChannel3;
                                            } else {
                                                c13975l.getClass();
                                                zCrashlytics = crashlytics(i13, z2, i11, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                                jLoadAd = c8117lLoadAd3.loadAd();
                                                loadAd(c8117lLoadAd3, byteBuffer, i11, c8117l6, c8117l5);
                                                fileChannel3.write(c8117lLoadAd3.crashlytics());
                                                byteBuffer.rewind();
                                                byteBuffer.limit(i);
                                                fileChannel3.write(byteBuffer);
                                                fileChannel3.write(byteBufferBilling);
                                                if (c8117l4 != null) {
                                                    channel.position(i4 + i14 + i12);
                                                    admob(jLoadAd, channel, fileChannel3, c8117l4);
                                                } else {
                                                    byteBuffer.limit(byteBuffer.capacity());
                                                    byteBuffer.position(i + i14 + i12);
                                                    fileChannel3.write(byteBuffer);
                                                    channel.position(c8117lLoadAd3.loadAd() - ((long) i11));
                                                }
                                                if (!zCrashlytics) {
                                                    yandex(channel, fileChannel3, i13, i11);
                                                }
                                                billing(channel, fileChannel3);
                                                fileChannel5 = fileChannel3;
                                            }
                                            channel.close();
                                            randomAccessFile.close();
                                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i32 = C17500l.yandex;
                                            c8201l3 = new C8201l(randomAccessFile2);
                                            c8117lLoadAd = C8201l.loadAd(c8201l3.crashlytics);
                                            if (c8117lLoadAd != null) {
                                                throw new C9511l("Unable to make changes to Mp4 file, no data was written");
                                            }
                                            if (c8117lLoadAd.loadAd == c8117lLoadAd2.loadAd) {
                                                throw new C9511l("Unable to make changes to Mp4 file, invalid data length has been written");
                                            }
                                            if (C8201l.loadAd(c8201l3.mopub) != null) {
                                                throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                                            }
                                            if (C8201l.loadAd(c8201l3.purchase) != null) {
                                                throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                                            }
                                            arrayList3 = c8201l3.remoteconfig;
                                            if (arrayList3.size() == arrayList2.size()) {
                                                Locale.getDefault();
                                                throw new C9511l("Unable to make changes to Mp4 file, incorrect number of tracks: " + arrayList2.size() + " vs " + arrayList3.size());
                                            }
                                            i19 = 0;
                                            i20 = 0;
                                            while (i20 < arrayList3.size()) {
                                                c18319l = (C18319l) arrayList3.get(i20);
                                                ArrayList arrayList5 = arrayList2;
                                                c18319l2 = (C18319l) arrayList5.get(i20);
                                                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                                                int i33 = AbstractC15690l.yandex;
                                                c13975l.getClass();
                                                int i34 = C17500l.yandex;
                                                if (i20 == 0) {
                                                    i21 = c18319l2.f35823l;
                                                    int i35 = (int) (((long) i21) - c8117lLoadAd2.crashlytics);
                                                    i22 = c18319l.f35823l;
                                                    j3 = ((long) i22) - c8117lLoadAd.crashlytics;
                                                    j4 = i35;
                                                    if (j3 == j4) {
                                                        Locale.getDefault();
                                                        throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + ((int) (j3 - j4)));
                                                    }
                                                    i19 = i21 - i22;
                                                } else if (i19 == c18319l2.f35823l - c18319l.f35823l) {
                                                    Locale.getDefault();
                                                    throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + i19);
                                                }
                                                i20++;
                                                arrayList2 = arrayList5;
                                            }
                                            randomAccessFile2.close();
                                            fileChannel5.close();
                                            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                                            int i36 = C17500l.yandex;
                                            return;
                                        }
                                        c13975l.getClass();
                                        jLoadAd3 = c8117lLoadAd3.loadAd();
                                        C7467l c7467lM2188l2 = C7467l.m2188l();
                                        int iLimit4 = byteBufferBilling.limit() + ((C8117l) c7467lM2188l2.f33215l).loadAd;
                                        EnumC8101l enumC8101l3 = EnumC8101l.UNKNOWN;
                                        C8117l c8117l13 = new C8117l("meta");
                                        c8117l13.purchase(iLimit4 + 12);
                                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                                        C8117l c8117l14 = new C8117l("udta");
                                        c8117l14.purchase(c8117l13.loadAd + 8);
                                        zCrashlytics3 = crashlytics(i13, z, c8117l14.loadAd, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                        c8117lLoadAd3.purchase(c8117lLoadAd3.loadAd + c8117l14.loadAd);
                                        fileChannel3.write(c8117lLoadAd3.crashlytics());
                                        byteBuffer.rewind();
                                        fileChannel3.write(byteBuffer);
                                        fileChannel3.write(c8117l14.crashlytics());
                                        fileChannel3.write(c8117l13.crashlytics());
                                        fileChannel3.write(byteBufferAllocate2);
                                        fileChannel3.write(((C8117l) c7467lM2188l2.f33215l).crashlytics());
                                        fileChannel3.write((ByteBuffer) c7467lM2188l2.f33214l);
                                        fileChannel3.write(byteBufferBilling);
                                        channel.position(i4 + i3 + i12);
                                        if (c8117l4 != null) {
                                            admob(jLoadAd3, channel, fileChannel3, c8117l4);
                                        } else {
                                            long jPosition2 = jLoadAd3 - channel.position();
                                            fileChannel3.transferFrom(channel, fileChannel3.position(), jPosition2);
                                            fileChannel3.position(fileChannel3.position() + jPosition2);
                                        }
                                        if (!zCrashlytics3) {
                                            yandex(channel, fileChannel3, i9, i11);
                                        }
                                        billing(channel, fileChannel3);
                                        fileChannel4 = fileChannel3;
                                    }
                                }
                            }
                            fileChannel5 = fileChannel4;
                            channel.close();
                            randomAccessFile.close();
                            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i37 = C17500l.yandex;
                            c8201l3 = new C8201l(randomAccessFile2);
                            c8117lLoadAd = C8201l.loadAd(c8201l3.crashlytics);
                            if (c8117lLoadAd != null) {
                                throw new C9511l("Unable to make changes to Mp4 file, no data was written");
                            }
                            if (c8117lLoadAd.loadAd == c8117lLoadAd2.loadAd) {
                                throw new C9511l("Unable to make changes to Mp4 file, invalid data length has been written");
                            }
                            if (C8201l.loadAd(c8201l3.mopub) != null) {
                                throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                            }
                            if (C8201l.loadAd(c8201l3.purchase) != null) {
                                throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                            }
                            arrayList3 = c8201l3.remoteconfig;
                            if (arrayList3.size() == arrayList2.size()) {
                                Locale.getDefault();
                                throw new C9511l("Unable to make changes to Mp4 file, incorrect number of tracks: " + arrayList2.size() + " vs " + arrayList3.size());
                            }
                            i19 = 0;
                            i20 = 0;
                            while (i20 < arrayList3.size()) {
                                c18319l = (C18319l) arrayList3.get(i20);
                                ArrayList arrayList6 = arrayList2;
                                c18319l2 = (C18319l) arrayList6.get(i20);
                                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                                int i38 = AbstractC15690l.yandex;
                                c13975l.getClass();
                                int i39 = C17500l.yandex;
                                if (i20 == 0) {
                                    i21 = c18319l2.f35823l;
                                    int i310 = (int) (((long) i21) - c8117lLoadAd2.crashlytics);
                                    i22 = c18319l.f35823l;
                                    j3 = ((long) i22) - c8117lLoadAd.crashlytics;
                                    j4 = i310;
                                    if (j3 == j4) {
                                        Locale.getDefault();
                                        throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + ((int) (j3 - j4)));
                                    }
                                    i19 = i21 - i22;
                                } else if (i19 == c18319l2.f35823l - c18319l.f35823l) {
                                    Locale.getDefault();
                                    throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + i19);
                                }
                                i20++;
                                arrayList2 = arrayList6;
                            }
                            randomAccessFile2.close();
                            fileChannel5.close();
                            EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                            int i311 = C17500l.yandex;
                            return;
                        }
                        c8117l2 = c8117lLoadAd5;
                        c8117l3 = c8117lLoadAd6;
                        i6 = (int) j5;
                        if (i3 == iLimit2) {
                            c13975l.getClass();
                            channel.position(0L);
                            FileChannel fileChannel8 = fileChannel;
                            fileChannel8.transferFrom(channel, 0L, c8117lLoadAd4.crashlytics);
                            fileChannel8.position(c8117lLoadAd4.crashlytics);
                            fileChannel8.write(byteBufferBilling);
                            channel.position(c8117lLoadAd4.loadAd());
                            purchase(channel, fileChannel8, c8117l);
                            fileChannel4 = fileChannel8;
                        } else {
                            fileChannel2 = fileChannel;
                            c8117l4 = c8117l;
                            byteBuffer = c8201l2.vip;
                            if (i3 > iLimit2) {
                                c13975l.getClass();
                                i15 = (int) (c8117lLoadAd4.crashlytics - (c8117lLoadAd3.crashlytics + 8));
                                iLimit = byteBufferBilling.limit();
                                i16 = c8117lLoadAd4.loadAd;
                                if (i5 > 0) {
                                    mopub(channel, fileChannel2, c8117lLoadAd4, byteBufferBilling);
                                    C15599l c15599l4 = new C15599l(((c8117lLoadAd4.loadAd - iLimit) + i5) - 8);
                                    fileChannel2.write(((C8117l) c15599l4.f33215l).crashlytics());
                                    fileChannel2.write((ByteBuffer) c15599l4.f33214l);
                                    channel.position(channel.position() + ((long) i5));
                                    purchase(channel, fileChannel2, c8117l4);
                                } else {
                                    i17 = (i16 - iLimit) - 8;
                                    if (i17 > 0) {
                                        mopub(channel, fileChannel2, c8117lLoadAd4, byteBufferBilling);
                                        C15599l c15599l5 = new C15599l(i17);
                                        fileChannel2.write(((C8117l) c15599l5.f33215l).crashlytics());
                                        fileChannel2.write((ByteBuffer) c15599l5.f33214l);
                                        purchase(channel, fileChannel2, c8117l4);
                                    } else {
                                        i18 = i16 - iLimit;
                                        channel.position(0L);
                                        FileChannel fileChannel9 = fileChannel2;
                                        fileChannel9.transferFrom(channel, 0L, c8117lLoadAd3.crashlytics);
                                        fileChannel9.position(c8117lLoadAd3.crashlytics);
                                        if (c8117lLoadAd2.crashlytics > c8117lLoadAd3.crashlytics) {
                                            it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                ((C18319l) it.next()).m4522l(-i18);
                                            }
                                        }
                                        loadAd(c8117lLoadAd3, byteBuffer, -i18, c8117l2, c8117l3);
                                        fileChannel9.write(c8117lLoadAd3.crashlytics());
                                        byteBuffer.rewind();
                                        byteBuffer.limit(i15);
                                        fileChannel9.write(byteBuffer);
                                        fileChannel9.write(byteBufferBilling);
                                        byteBuffer.limit(byteBuffer.capacity());
                                        byteBuffer.position(i15 + c8117lLoadAd4.loadAd);
                                        fileChannel9.write(byteBuffer);
                                        channel.position(c8117lLoadAd3.loadAd() + ((long) i18));
                                        purchase(channel, fileChannel9, c8117l4);
                                        fileChannel4 = fileChannel9;
                                    }
                                }
                                fileChannel4 = fileChannel2;
                            } else {
                                fileChannel3 = fileChannel2;
                                c8117l5 = c8117l3;
                                i10 = iLimit2 - i3;
                                if (i10 <= i5 - 8) {
                                    c13975l.getClass();
                                    mopub(channel, fileChannel3, c8117lLoadAd4, byteBufferBilling);
                                    C15599l c15599l6 = new C15599l((i5 - i10) - 8);
                                    fileChannel3.write(((C8117l) c15599l6.f33215l).crashlytics());
                                    fileChannel3.write((ByteBuffer) c15599l6.f33214l);
                                    channel.position(channel.position() + ((long) i5));
                                    purchase(channel, fileChannel3, c8117l4);
                                    fileChannel4 = fileChannel3;
                                } else {
                                    i11 = i10 - i5;
                                    channel.position(0L);
                                    i12 = i5;
                                    c8117l6 = c8117l2;
                                    i13 = i7;
                                    fileChannel3.transferFrom(channel, 0L, c8117lLoadAd3.crashlytics);
                                    fileChannel3.position(c8117lLoadAd3.crashlytics);
                                    if (c8117l6 == null) {
                                        z2 = z;
                                        i14 = i3;
                                        if (c8117l5 == null) {
                                            c13975l.getClass();
                                            jLoadAd2 = c8117lLoadAd3.loadAd();
                                            int iLimit5 = byteBufferBilling.limit();
                                            int iYandex4 = c8117lLoadAd3.yandex();
                                            int i312 = c8117l6.loadAd;
                                            int iYandex5 = c8117l6.yandex();
                                            C7467l c7467lM2188l3 = C7467l.m2188l();
                                            int i313 = ((C8117l) c7467lM2188l3.f33215l).loadAd + iLimit5;
                                            EnumC8101l enumC8101l4 = EnumC8101l.UNKNOWN;
                                            C8117l c8117l15 = new C8117l("meta");
                                            c8117l15.purchase(i313 + 12);
                                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                                            C8117l c8117l16 = new C8117l("udta");
                                            c8117l16.purchase(c8117l15.loadAd + 8 + iYandex5);
                                            int iYandex6 = c8117l16.yandex() - iYandex5;
                                            zCrashlytics2 = crashlytics(i13, z2, iYandex6, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                            c8117lLoadAd3.purchase(c8117lLoadAd3.loadAd + iYandex6);
                                            fileChannel3.write(c8117lLoadAd3.crashlytics());
                                            byteBuffer.rewind();
                                            byteBuffer.limit(iYandex4 - i312);
                                            fileChannel3.write(byteBuffer);
                                            fileChannel3.write(c8117l16.crashlytics());
                                            if (byteBuffer.position() + 8 < byteBuffer.capacity()) {
                                                byteBuffer.limit(byteBuffer.capacity());
                                                byteBuffer.position(byteBuffer.position() + 8);
                                                fileChannel3.write(byteBuffer);
                                            }
                                            fileChannel3.write(c8117l15.crashlytics());
                                            fileChannel3.write(byteBufferAllocate3);
                                            fileChannel3.write(((C8117l) c7467lM2188l3.f33215l).crashlytics());
                                            fileChannel3.write((ByteBuffer) c7467lM2188l3.f33214l);
                                            fileChannel3.write(byteBufferBilling);
                                            channel.position(i4 + i14 + i12);
                                            if (c8117l4 != null) {
                                                admob(jLoadAd2, channel, fileChannel3, c8117l4);
                                            } else {
                                                long jPosition3 = jLoadAd2 - channel.position();
                                                fileChannel3.transferFrom(channel, fileChannel3.position(), jPosition3);
                                                fileChannel3.position(fileChannel3.position() + jPosition3);
                                            }
                                            if (!zCrashlytics2) {
                                                yandex(channel, fileChannel3, i9, i11);
                                            }
                                            billing(channel, fileChannel3);
                                            fileChannel4 = fileChannel3;
                                        } else {
                                            c13975l.getClass();
                                            zCrashlytics = crashlytics(i13, z2, i11, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                            jLoadAd = c8117lLoadAd3.loadAd();
                                            loadAd(c8117lLoadAd3, byteBuffer, i11, c8117l6, c8117l5);
                                            fileChannel3.write(c8117lLoadAd3.crashlytics());
                                            byteBuffer.rewind();
                                            byteBuffer.limit(i);
                                            fileChannel3.write(byteBuffer);
                                            fileChannel3.write(byteBufferBilling);
                                            if (c8117l4 != null) {
                                                channel.position(i4 + i14 + i12);
                                                admob(jLoadAd, channel, fileChannel3, c8117l4);
                                            } else {
                                                byteBuffer.limit(byteBuffer.capacity());
                                                byteBuffer.position(i + i14 + i12);
                                                fileChannel3.write(byteBuffer);
                                                channel.position(c8117lLoadAd3.loadAd() - ((long) i11));
                                            }
                                            if (!zCrashlytics) {
                                                yandex(channel, fileChannel3, i13, i11);
                                            }
                                            billing(channel, fileChannel3);
                                            fileChannel5 = fileChannel3;
                                        }
                                        channel.close();
                                        randomAccessFile.close();
                                        EnumC8711l[] enumC8711lArr9 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i314 = C17500l.yandex;
                                        c8201l3 = new C8201l(randomAccessFile2);
                                        c8117lLoadAd = C8201l.loadAd(c8201l3.crashlytics);
                                        if (c8117lLoadAd != null) {
                                            throw new C9511l("Unable to make changes to Mp4 file, no data was written");
                                        }
                                        if (c8117lLoadAd.loadAd == c8117lLoadAd2.loadAd) {
                                            throw new C9511l("Unable to make changes to Mp4 file, invalid data length has been written");
                                        }
                                        if (C8201l.loadAd(c8201l3.mopub) != null) {
                                            throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                                        }
                                        if (C8201l.loadAd(c8201l3.purchase) != null) {
                                            throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                                        }
                                        arrayList3 = c8201l3.remoteconfig;
                                        if (arrayList3.size() == arrayList2.size()) {
                                            Locale.getDefault();
                                            throw new C9511l("Unable to make changes to Mp4 file, incorrect number of tracks: " + arrayList2.size() + " vs " + arrayList3.size());
                                        }
                                        i19 = 0;
                                        i20 = 0;
                                        while (i20 < arrayList3.size()) {
                                            c18319l = (C18319l) arrayList3.get(i20);
                                            ArrayList arrayList7 = arrayList2;
                                            c18319l2 = (C18319l) arrayList7.get(i20);
                                            EnumC8711l[] enumC8711lArr10 = EnumC8711l.f17925l;
                                            int i315 = AbstractC15690l.yandex;
                                            c13975l.getClass();
                                            int i316 = C17500l.yandex;
                                            if (i20 == 0) {
                                                i21 = c18319l2.f35823l;
                                                int i317 = (int) (((long) i21) - c8117lLoadAd2.crashlytics);
                                                i22 = c18319l.f35823l;
                                                j3 = ((long) i22) - c8117lLoadAd.crashlytics;
                                                j4 = i317;
                                                if (j3 == j4) {
                                                    Locale.getDefault();
                                                    throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + ((int) (j3 - j4)));
                                                }
                                                i19 = i21 - i22;
                                            } else if (i19 == c18319l2.f35823l - c18319l.f35823l) {
                                                Locale.getDefault();
                                                throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + i19);
                                            }
                                            i20++;
                                            arrayList2 = arrayList7;
                                        }
                                        randomAccessFile2.close();
                                        fileChannel5.close();
                                        EnumC8711l[] enumC8711lArr11 = EnumC8711l.f17925l;
                                        int i318 = C17500l.yandex;
                                        return;
                                    }
                                    c13975l.getClass();
                                    jLoadAd3 = c8117lLoadAd3.loadAd();
                                    C7467l c7467lM2188l4 = C7467l.m2188l();
                                    int iLimit6 = byteBufferBilling.limit() + ((C8117l) c7467lM2188l4.f33215l).loadAd;
                                    EnumC8101l enumC8101l5 = EnumC8101l.UNKNOWN;
                                    C8117l c8117l17 = new C8117l("meta");
                                    c8117l17.purchase(iLimit6 + 12);
                                    ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(4);
                                    C8117l c8117l18 = new C8117l("udta");
                                    c8117l18.purchase(c8117l17.loadAd + 8);
                                    zCrashlytics3 = crashlytics(i13, z, c8117l18.loadAd, arrayList2, c8117lLoadAd3, c8117lLoadAd2);
                                    c8117lLoadAd3.purchase(c8117lLoadAd3.loadAd + c8117l18.loadAd);
                                    fileChannel3.write(c8117lLoadAd3.crashlytics());
                                    byteBuffer.rewind();
                                    fileChannel3.write(byteBuffer);
                                    fileChannel3.write(c8117l18.crashlytics());
                                    fileChannel3.write(c8117l17.crashlytics());
                                    fileChannel3.write(byteBufferAllocate4);
                                    fileChannel3.write(((C8117l) c7467lM2188l4.f33215l).crashlytics());
                                    fileChannel3.write((ByteBuffer) c7467lM2188l4.f33214l);
                                    fileChannel3.write(byteBufferBilling);
                                    channel.position(i4 + i3 + i12);
                                    if (c8117l4 != null) {
                                        admob(jLoadAd3, channel, fileChannel3, c8117l4);
                                    } else {
                                        long jPosition4 = jLoadAd3 - channel.position();
                                        fileChannel3.transferFrom(channel, fileChannel3.position(), jPosition4);
                                        fileChannel3.position(fileChannel3.position() + jPosition4);
                                    }
                                    if (!zCrashlytics3) {
                                        yandex(channel, fileChannel3, i9, i11);
                                    }
                                    billing(channel, fileChannel3);
                                    fileChannel4 = fileChannel3;
                                }
                            }
                        }
                        c8201l3 = new C8201l(randomAccessFile2);
                        c8117lLoadAd = C8201l.loadAd(c8201l3.crashlytics);
                        if (c8117lLoadAd != null) {
                            throw new C9511l("Unable to make changes to Mp4 file, no data was written");
                        }
                        if (c8117lLoadAd.loadAd == c8117lLoadAd2.loadAd) {
                            throw new C9511l("Unable to make changes to Mp4 file, invalid data length has been written");
                        }
                        if (C8201l.loadAd(c8201l3.mopub) != null) {
                            throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                        }
                        if (C8201l.loadAd(c8201l3.purchase) != null) {
                            throw new C9511l("Unable to make changes to Mp4 file, no tag data has been written");
                        }
                        arrayList3 = c8201l3.remoteconfig;
                        if (arrayList3.size() == arrayList2.size()) {
                            Locale.getDefault();
                            throw new C9511l("Unable to make changes to Mp4 file, incorrect number of tracks: " + arrayList2.size() + " vs " + arrayList3.size());
                        }
                        i19 = 0;
                        i20 = 0;
                        while (i20 < arrayList3.size()) {
                            c18319l = (C18319l) arrayList3.get(i20);
                            ArrayList arrayList8 = arrayList2;
                            c18319l2 = (C18319l) arrayList8.get(i20);
                            EnumC8711l[] enumC8711lArr12 = EnumC8711l.f17925l;
                            int i319 = AbstractC15690l.yandex;
                            c13975l.getClass();
                            int i3110 = C17500l.yandex;
                            if (i20 == 0) {
                                i21 = c18319l2.f35823l;
                                int i3111 = (int) (((long) i21) - c8117lLoadAd2.crashlytics);
                                i22 = c18319l.f35823l;
                                j3 = ((long) i22) - c8117lLoadAd.crashlytics;
                                j4 = i3111;
                                if (j3 == j4) {
                                    Locale.getDefault();
                                    throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + ((int) (j3 - j4)));
                                }
                                i19 = i21 - i22;
                            } else if (i19 == c18319l2.f35823l - c18319l.f35823l) {
                                Locale.getDefault();
                                throw new C9511l("Unable to make changes to Mp4 file, incorrect offsets written difference was " + i19);
                            }
                            i20++;
                            arrayList2 = arrayList8;
                        }
                        randomAccessFile2.close();
                        fileChannel5.close();
                        EnumC8711l[] enumC8711lArr13 = EnumC8711l.f17925l;
                        int i3112 = C17500l.yandex;
                        return;
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof C9511l) {
                            throw ((C9511l) e);
                        }
                        e.printStackTrace();
                        throw new C9511l("Unable to make changes to Mp4 file", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile3 = randomAccessFile2;
                    randomAccessFile3.close();
                    fileChannel5.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = channel;
                randomAccessFile3.close();
                fileChannel5.close();
                throw th;
            }
            i8 = i6;
            z = true;
            EnumC8711l[] enumC8711lArr14 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i210 = C17500l.yandex;
            c8201l2 = c8201l;
            i9 = i8;
            arrayList2 = c8201l2.remoteconfig;
            fileChannel5 = fileChannel4;
            channel.close();
            randomAccessFile.close();
            EnumC8711l[] enumC8711lArr15 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3113 = C17500l.yandex;
        } catch (C13768l e3) {
            throw new C9511l(e3.getMessage());
        }
    }
}
