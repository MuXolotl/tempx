package defpackage;

import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal;
import ealvatag.tag.id3.framebody.AbstractFrameBodyPairs;
import ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo;
import ealvatag.tag.id3.framebody.FrameBodyAPIC;
import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyEncrypted;
import ealvatag.tag.id3.framebody.FrameBodyIPLS;
import ealvatag.tag.id3.framebody.FrameBodyPIC;
import ealvatag.tag.id3.framebody.FrameBodyPOPM;
import ealvatag.tag.id3.framebody.FrameBodyTIPL;
import ealvatag.tag.id3.framebody.FrameBodyTMCL;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyUSLT;
import ealvatag.tag.id3.framebody.FrameBodyUnsupported;
import ealvatag.tag.id3.framebody.FrameBodyWOAR;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/* JADX INFO: renamed from: lِؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3348l extends AbstractC4674l implements InterfaceC13280l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final byte[] f7141l = {73, 68, 51};

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C13975l f7142l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public LinkedHashMap f7146l = null;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public LinkedHashMap f7145l = null;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public String f7143l = "";

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public Long f7147l = null;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Long f7144l = null;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f7142l = new C13975l(4);
    }

    public static FileLock inmobi(FileChannel fileChannel, String str) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f7142l.getClass();
        int i = C17500l.yandex;
        try {
            FileLock fileLockTryLock = fileChannel.tryLock();
            if (fileLockTryLock != null) {
                return fileLockTryLock;
            }
            Locale.getDefault();
            C18262l.metrica(AbstractC15560l.Signature("Cannot make changes to file ", str, " because it is being used by another application"));
            return null;
        } catch (IOException | Error unused) {
        }
    }

    public static int license(int i, int i2) {
        return i <= i2 ? i2 : i + 100;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static void m1320throw(File file, File file2) throws C4266l {
        File file3 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC5578l.billing(file.getPath()).concat(".old"));
        int i = 1;
        while (file3.exists()) {
            file3 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC5578l.billing(file.getPath()) + ".old" + i);
            i++;
        }
        boolean zRenameTo = file.renameTo(file3);
        C13975l c13975l = f7142l;
        if (!zRenameTo) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            file2.delete();
            throw new C4266l("Cannot make changes to file %s because unable to rename the original file to %s", file, file3);
        }
        if (file2.renameTo(file)) {
            if (file3.delete()) {
                return;
            }
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            return;
        }
        if (!file2.exists()) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
        }
        if (!file3.renameTo(file)) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
        }
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i6 = C17500l.yandex;
        file2.delete();
        throw new C4266l("Cannot make changes to file %s because unable to rename from temporary file %s", file, file2);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static boolean m1321volatile(RandomAccessFile randomAccessFile) throws IOException {
        long filePointer = randomAccessFile.getFilePointer();
        byte[] bArr = new byte[3];
        randomAccessFile.read(bArr);
        randomAccessFile.seek(filePointer);
        if (!Arrays.equals(bArr, f7141l)) {
            return false;
        }
        byte[] bArr2 = new byte[4];
        randomAccessFile.seek(randomAccessFile.getFilePointer() + 6);
        randomAccessFile.read(bArr2);
        randomAccessFile.seek(AbstractC17265l.crashlytics(ByteBuffer.wrap(bArr2)) + 10);
        return true;
    }

    public final void ad(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[3];
        FileChannel channel = randomAccessFile.getChannel();
        channel.position();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10);
        channel.read(byteBufferAllocate, 0L);
        byteBufferAllocate.flip();
        if (m1323catch(byteBufferAllocate)) {
            randomAccessFile.seek(0L);
            randomAccessFile.write(bArr);
        }
    }

    public final AbstractC3348l advert(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        C18449l c18449lMo1331package = mo1331package(enumC17969l);
        int iOrdinal = enumC17969l.ordinal();
        EnumC17969l enumC17969l2 = EnumC17969l.DISC_TOTAL;
        EnumC17969l enumC17969l3 = EnumC17969l.DISC_NO;
        if (iOrdinal == 34) {
            isVip(c18449lMo1331package, enumC17969l3, enumC17969l2, true);
            return this;
        }
        if (iOrdinal == 36) {
            isVip(c18449lMo1331package, enumC17969l3, enumC17969l2, false);
            return this;
        }
        EnumC17969l enumC17969l4 = EnumC17969l.MOVEMENT_TOTAL;
        EnumC17969l enumC17969l5 = EnumC17969l.MOVEMENT_NO;
        if (iOrdinal == 70) {
            isVip(c18449lMo1331package, enumC17969l5, enumC17969l4, true);
            return this;
        }
        if (iOrdinal == 71) {
            isVip(c18449lMo1331package, enumC17969l5, enumC17969l4, false);
            return this;
        }
        EnumC17969l enumC17969l6 = EnumC17969l.TRACK_TOTAL;
        EnumC17969l enumC17969l7 = EnumC17969l.TRACK;
        if (iOrdinal == 137) {
            isVip(c18449lMo1331package, enumC17969l7, enumC17969l6, true);
            return this;
        }
        if (iOrdinal != 138) {
            signatures(c18449lMo1331package);
            return this;
        }
        isVip(c18449lMo1331package, enumC17969l7, enumC17969l6, false);
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final int amazon() {
        int i = 0;
        while (true) {
            try {
                i++;
            } catch (NoSuchElementException unused) {
                return i;
            }
        }
    }

    public String applovin() {
        return DataTypes.OBJ_MIME_TYPE;
    }

    public final AbstractC1186l appmetrica(String str) {
        Object obj = this.f7146l.get(str);
        if (obj == null) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        if (obj instanceof List) {
            return AbstractC1186l.Signature((List) obj);
        }
        if (obj instanceof AbstractC0231l) {
            return AbstractC1186l.isVip((InterfaceC4656l) obj);
        }
        C18073l.license(AbstractC15560l.subscription(obj, "Found entry in frameMap that was not a frame or a list:"));
        return null;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m1322case(int i, ByteArrayOutputStream byteArrayOutputStream) {
        mo1334switch(Channels.newChannel(byteArrayOutputStream), i);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final boolean m1323catch(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        byteBuffer.position();
        byteBuffer.limit();
        byteBuffer.capacity();
        f7142l.getClass();
        int i = C17500l.yandex;
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, f7141l) && byteBuffer.get() == Signature() && byteBuffer.get() == 0;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final ByteArrayOutputStream m1324class() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m1329interface(this.f7146l, byteArrayOutputStream);
        m1329interface(this.f7145l, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7411. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m1325continue(java.io.File r32, java.nio.ByteBuffer r33, byte[] r34, int r35, int r36, long r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3348l.m1325continue(java.io.File, java.nio.ByteBuffer, byte[], int, int, long):void");
    }

    @Override // defpackage.InterfaceC15476l
    public AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        C18449l c18449lMo1331package = mo1331package(enumC17969l);
        AbstractC1186l abstractC1186lAppmetrica = appmetrica((String) c18449lMo1331package.f36009l);
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        String str = (String) c18449lMo1331package.f36012l;
        if (str == null) {
            if (AbstractC9403l.yandex.contains(enumC17969l)) {
                C9258l c9258lListIterator = abstractC1186lAppmetrica.listIterator(0);
                while (c9258lListIterator.hasNext()) {
                    InterfaceC4656l interfaceC4656l = (InterfaceC4656l) c9258lListIterator.next();
                    AbstractC16446l abstractC16446l = ((AbstractC0231l) interfaceC4656l).f5140l;
                    if ((abstractC16446l instanceof AbstractFrameBodyNumberTotal) && ((AbstractFrameBodyNumberTotal) abstractC16446l).getNumber() != null) {
                        c16971lMetrica.crashlytics(interfaceC4656l);
                    }
                }
                return c16971lMetrica.mopub();
            }
            if (!AbstractC9403l.loadAd.contains(enumC17969l)) {
                return abstractC1186lAppmetrica;
            }
            C9258l c9258lListIterator2 = abstractC1186lAppmetrica.listIterator(0);
            while (c9258lListIterator2.hasNext()) {
                InterfaceC4656l interfaceC4656l2 = (InterfaceC4656l) c9258lListIterator2.next();
                AbstractC16446l abstractC16446l2 = ((AbstractC0231l) interfaceC4656l2).f5140l;
                if ((abstractC16446l2 instanceof AbstractFrameBodyNumberTotal) && ((AbstractFrameBodyNumberTotal) abstractC16446l2).getTotal() != null) {
                    c16971lMetrica.crashlytics(interfaceC4656l2);
                }
            }
            return c16971lMetrica.mopub();
        }
        C9258l c9258lListIterator3 = abstractC1186lAppmetrica.listIterator(0);
        while (c9258lListIterator3.hasNext()) {
            InterfaceC4656l interfaceC4656l3 = (InterfaceC4656l) c9258lListIterator3.next();
            AbstractC16446l abstractC16446l3 = ((AbstractC0231l) interfaceC4656l3).f5140l;
            if (abstractC16446l3 instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC16446l3).getDescription().equals(str)) {
                    c16971lMetrica.crashlytics(interfaceC4656l3);
                }
            } else if (abstractC16446l3 instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC16446l3).getDescription().equals(str)) {
                    c16971lMetrica.crashlytics(interfaceC4656l3);
                }
            } else if (abstractC16446l3 instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC16446l3).getDescription().equals(str)) {
                    c16971lMetrica.crashlytics(interfaceC4656l3);
                }
            } else if (abstractC16446l3 instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC16446l3).getOwner().equals(str)) {
                    c16971lMetrica.crashlytics(interfaceC4656l3);
                }
            } else if (abstractC16446l3 instanceof FrameBodyIPLS) {
                Iterator<Pair> it = ((FrameBodyIPLS) abstractC16446l3).getPairing().getMapping().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().equals(str)) {
                        c16971lMetrica.crashlytics(interfaceC4656l3);
                    }
                }
            } else {
                if (!(abstractC16446l3 instanceof FrameBodyTIPL)) {
                    if (abstractC16446l3 instanceof FrameBodyUnsupported) {
                        return abstractC1186lAppmetrica;
                    }
                    C8339l.isPro(abstractC16446l3.getClass(), "Need to implement getFields(FieldKey genericKey) for:");
                    return null;
                }
                Iterator<Pair> it2 = ((FrameBodyTIPL) abstractC16446l3).getPairing().getMapping().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getKey().equals(str)) {
                        c16971lMetrica.crashlytics(interfaceC4656l3);
                    }
                }
            }
        }
        return c16971lMetrica.mopub();
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public abstract long mo1326else(File file, long j);

    @Override // defpackage.AbstractC4674l
    public boolean equals(Object obj) {
        return (obj instanceof AbstractC3348l) && this.f7146l.equals(((AbstractC3348l) obj).f7146l) && super.equals(obj);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m1327extends(AbstractC0231l abstractC0231l, List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0231l abstractC0231l2 = (AbstractC0231l) listIterator.next();
            AbstractC16446l abstractC16446l = abstractC0231l.f5140l;
            if (abstractC16446l instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC16446l).getDescription().equals(((FrameBodyTXXX) abstractC0231l2.f5140l).getDescription())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else if (abstractC16446l instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC16446l).getDescription().equals(((FrameBodyWXXX) abstractC0231l2.f5140l).getDescription())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else if (abstractC16446l instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC16446l).getDescription().equals(((FrameBodyCOMM) abstractC0231l2.f5140l).getDescription())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else if (abstractC16446l instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC16446l).getOwner().equals(((FrameBodyUFID) abstractC0231l2.f5140l).getOwner())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else if (abstractC16446l instanceof FrameBodyUSLT) {
                if (((FrameBodyUSLT) abstractC16446l).getDescription().equals(((FrameBodyUSLT) abstractC0231l2.f5140l).getDescription())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else if (abstractC16446l instanceof FrameBodyPOPM) {
                if (((FrameBodyPOPM) abstractC16446l).getEmailToUser().equals(((FrameBodyPOPM) abstractC0231l2.f5140l).getEmailToUser())) {
                    listIterator.set(abstractC0231l);
                    this.f7146l.put(abstractC0231l.f1216l, list);
                    return;
                }
            } else {
                if (abstractC16446l instanceof AbstractFrameBodyNumberTotal) {
                    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal = (AbstractFrameBodyNumberTotal) abstractC16446l;
                    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal2 = (AbstractFrameBodyNumberTotal) abstractC0231l2.f5140l;
                    if (abstractFrameBodyNumberTotal.getNumber() != null && abstractFrameBodyNumberTotal.getNumber().intValue() > 0) {
                        abstractFrameBodyNumberTotal2.setNumber(abstractFrameBodyNumberTotal.getNumberAsText());
                    }
                    if (abstractFrameBodyNumberTotal.getTotal() == null || abstractFrameBodyNumberTotal.getTotal().intValue() <= 0) {
                        return;
                    }
                    abstractFrameBodyNumberTotal2.setTotal(abstractFrameBodyNumberTotal.getTotalAsText());
                    return;
                }
                if (abstractC16446l instanceof AbstractFrameBodyPairs) {
                    ((AbstractFrameBodyPairs) abstractC0231l2.f5140l).addPair(((AbstractFrameBodyPairs) abstractC16446l).getText());
                    return;
                }
            }
        }
        if (!mo1335synchronized().crashlytics(abstractC0231l.f1216l)) {
            this.f7146l.put(abstractC0231l.f1216l, abstractC0231l);
        } else {
            list.add(abstractC0231l);
            this.f7146l.put(abstractC0231l.f1216l, list);
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) throws C9706l {
        remoteconfig(yandex(enumC17969l, strArr));
        return this;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m1328for(String str) {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f7142l.getClass();
        int i = C17500l.yandex;
        this.f7146l.remove(str);
    }

    @Override // defpackage.AbstractC18219l
    public int getSize() {
        int size = 0;
        for (Object obj : this.f7146l.values()) {
            if (obj instanceof AbstractC0231l) {
                size = ((AbstractC0231l) obj).getSize() + size;
            } else if (obj instanceof C5021l) {
                Iterator it = ((C5021l) obj).f10251l.iterator();
                while (it.hasNext()) {
                    size += ((AbstractC0231l) it.next()).getSize();
                }
            } else if (obj instanceof List) {
                ListIterator listIterator = ((ArrayList) obj).listIterator();
                while (listIterator.hasNext()) {
                    size += ((AbstractC0231l) listIterator.next()).getSize();
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m1329interface(LinkedHashMap linkedHashMap, ByteArrayOutputStream byteArrayOutputStream) {
        TreeSet treeSet = new TreeSet(mo1333strictfp());
        treeSet.addAll(linkedHashMap.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Object obj = linkedHashMap.get((String) it.next());
            if (obj instanceof AbstractC0231l) {
                AbstractC0231l abstractC0231l = (AbstractC0231l) obj;
                abstractC0231l.f1217l = this.f9508l;
                abstractC0231l.write(byteArrayOutputStream);
            } else if (obj instanceof C5021l) {
                for (AbstractC0231l abstractC0231l2 : ((C5021l) obj).f10251l) {
                    abstractC0231l2.f1217l = this.f9508l;
                    abstractC0231l2.write(byteArrayOutputStream);
                }
            } else {
                for (AbstractC0231l abstractC0231l3 : (List) obj) {
                    abstractC0231l3.f1217l = this.f9508l;
                    abstractC0231l3.write(byteArrayOutputStream);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        return this.f7146l.size() == 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        return new C11506l(this.f7146l.entrySet().iterator(), this.f7146l.entrySet().iterator());
    }

    public final void isVip(C18449l c18449l, EnumC17969l enumC17969l, EnumC17969l enumC17969l2, boolean z) {
        if (z) {
            if (m1336throws(enumC17969l2).length() == 0) {
                signatures(c18449l);
                return;
            } else {
                ((AbstractFrameBodyNumberTotal) ((AbstractC0231l) this.f7146l.get((String) c18449l.f36009l)).f5140l).setNumber((Integer) 0);
                return;
            }
        }
        if (m1336throws(enumC17969l).length() == 0) {
            signatures(c18449l);
        } else {
            ((AbstractFrameBodyNumberTotal) ((AbstractC0231l) this.f7146l.get((String) c18449l.f36009l)).f5140l).setTotal((Integer) 0);
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) throws C9706l {
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        remoteconfig(smaato(abstractC5859l));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        AbstractC1186l abstractC1186lCrashlytics = crashlytics(enumC17969l);
        return (abstractC1186lCrashlytics.size() > 0 ? AbstractC17238l.yandex(abstractC1186lCrashlytics.get(0)) : C1972l.f4482l).crashlytics();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void mo1330native(String str, AbstractC0231l abstractC0231l) {
        if (abstractC0231l.f5140l instanceof FrameBodyEncrypted) {
            mo1332private(this.f7145l, str, abstractC0231l);
        } else {
            mo1332private(this.f7146l, str, abstractC0231l);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public abstract C18449l mo1331package(EnumC17969l enumC17969l);

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void mo1332private(HashMap map, String str, AbstractC0231l abstractC0231l) {
        boolean zCrashlytics = C6647l.subs().crashlytics(str);
        C13975l c13975l = f7142l;
        if (!zCrashlytics && !C5566l.admob().crashlytics(str) && !C6647l.admob().crashlytics(str)) {
            if (!map.containsKey(str)) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
                map.put(str, abstractC0231l);
                return;
            }
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            if (this.f7143l.length() > 0) {
                this.f7143l = this.f7143l.concat(";");
            }
            this.f7143l = AbstractC0653l.ads(new StringBuilder(), this.f7143l, str);
            ((AbstractC0231l) this.f7146l.get(str)).getSize();
            return;
        }
        if (!map.containsKey(str)) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            map.put(str, abstractC0231l);
            return;
        }
        Object obj = map.get(str);
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(abstractC0231l);
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((AbstractC0231l) obj);
        arrayList.add(abstractC0231l);
        map.put(str, arrayList);
        EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i5 = C17500l.yandex;
    }

    public abstract AbstractC0231l pro(String str);

    /* JADX WARN: Code duplicated, block: B:102:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    @Override // defpackage.InterfaceC15476l
    public AbstractC17238l purchase(EnumC17969l enumC17969l) {
        C18449l c18449lMo1331package;
        ArrayList arrayList;
        String str;
        String str2;
        EnumC17969l enumC17969l2;
        Iterator it;
        AbstractC0231l abstractC0231l;
        AbstractC16446l abstractC16446l;
        Iterator it2;
        AbstractC16446l abstractC16446l2;
        FrameBodyTXXX frameBodyTXXX;
        FrameBodyWXXX frameBodyWXXX;
        FrameBodyCOMM frameBodyCOMM;
        FrameBodyUFID frameBodyUFID;
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        EnumSet enumSet = AbstractC9403l.yandex;
        if (enumSet.contains(enumC17969l) || AbstractC9403l.loadAd.contains(enumC17969l)) {
            AbstractC1186l abstractC1186lCrashlytics = crashlytics(enumC17969l);
            if (abstractC1186lCrashlytics.size() > 0) {
                AbstractC0231l abstractC0231l2 = (AbstractC0231l) abstractC1186lCrashlytics.get(0);
                if (enumSet.contains(enumC17969l)) {
                    return AbstractC17238l.amazon(((AbstractFrameBodyNumberTotal) abstractC0231l2.f5140l).getNumberAsText());
                }
                if (AbstractC9403l.loadAd.contains(enumC17969l)) {
                    return AbstractC17238l.amazon(((AbstractFrameBodyNumberTotal) abstractC0231l2.f5140l).getTotalAsText());
                }
                c18449lMo1331package = mo1331package(enumC17969l);
                arrayList = new ArrayList();
                str = (String) c18449lMo1331package.f36012l;
                str2 = (String) c18449lMo1331package.f36009l;
                if (str != null) {
                    it2 = appmetrica(str2).iterator();
                    while (it2.hasNext()) {
                        abstractC16446l2 = ((AbstractC0231l) ((InterfaceC4656l) it2.next())).f5140l;
                        if (abstractC16446l2 instanceof FrameBodyTXXX) {
                            frameBodyTXXX = (FrameBodyTXXX) abstractC16446l2;
                            if (frameBodyTXXX.getDescription().equals(str)) {
                                arrayList.addAll(frameBodyTXXX.getValues());
                            }
                        } else if (abstractC16446l2 instanceof FrameBodyWXXX) {
                            frameBodyWXXX = (FrameBodyWXXX) abstractC16446l2;
                            if (frameBodyWXXX.getDescription().equals(str)) {
                                arrayList.addAll(frameBodyWXXX.getUrlLinks());
                            }
                        } else if (abstractC16446l2 instanceof FrameBodyCOMM) {
                            frameBodyCOMM = (FrameBodyCOMM) abstractC16446l2;
                            if (frameBodyCOMM.getDescription().equals(str)) {
                                arrayList.addAll(frameBodyCOMM.getValues());
                            }
                        } else if (abstractC16446l2 instanceof FrameBodyUFID) {
                            frameBodyUFID = (FrameBodyUFID) abstractC16446l2;
                            if (!frameBodyUFID.getOwner().equals(str) && frameBodyUFID.getUniqueIdentifier() != null) {
                                arrayList.add(new String(frameBodyUFID.getUniqueIdentifier()));
                            }
                        } else {
                            if (abstractC16446l2 instanceof AbstractFrameBodyPairs) {
                                throw new C6451l("Need to implement getFields(FieldKey genericKey) for:" + abstractC16446l2.getClass(), 18, (byte) 0);
                            }
                            for (Pair pair : ((AbstractFrameBodyPairs) abstractC16446l2).getPairing().getMapping()) {
                                if (!pair.getKey().equals(str) && pair.getValue() != null) {
                                    arrayList.add(pair.getValue());
                                }
                            }
                        }
                    }
                } else {
                    enumC17969l2 = (EnumC17969l) c18449lMo1331package.f36010l;
                    if (enumC17969l2 == null && (enumC17969l2 == EnumC17969l.PERFORMER || enumC17969l2 == EnumC17969l.INVOLVED_PERSON)) {
                        Iterator it3 = appmetrica(str2).iterator();
                        while (it3.hasNext()) {
                            AbstractC16446l abstractC16446l3 = ((AbstractC0231l) ((InterfaceC4656l) it3.next())).f5140l;
                            if (abstractC16446l3 instanceof AbstractFrameBodyPairs) {
                                for (Pair pair2 : ((AbstractFrameBodyPairs) abstractC16446l3).getPairing().getMapping()) {
                                    if (((EnumC1699l) EnumC1699l.f4087l.get(pair2.getKey())) == null && !pair2.getValue().isEmpty()) {
                                        if (pair2.getKey().isEmpty()) {
                                            arrayList.add(pair2.getValue());
                                        } else {
                                            arrayList.add(pair2.getPairValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        it = appmetrica(str2).iterator();
                        while (it.hasNext()) {
                            abstractC0231l = (AbstractC0231l) ((InterfaceC4656l) it.next());
                            if (abstractC0231l != null) {
                                abstractC16446l = abstractC0231l.f5140l;
                                if (abstractC16446l instanceof AbstractFrameBodyTextInfo) {
                                    arrayList.addAll(((AbstractFrameBodyTextInfo) abstractC16446l).getValues());
                                } else {
                                    arrayList.add(abstractC16446l.getUserFriendlyValue());
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    return AbstractC17238l.amazon(arrayList.get(0));
                }
            }
        } else if (enumC17969l == EnumC17969l.RATING) {
            AbstractC1186l abstractC1186lCrashlytics2 = crashlytics(enumC17969l);
            if (abstractC1186lCrashlytics2 != null && abstractC1186lCrashlytics2.size() > 0) {
                return AbstractC17238l.amazon(String.valueOf(((FrameBodyPOPM) ((AbstractC0231l) abstractC1186lCrashlytics2.get(0)).f5140l).getRating()));
            }
        } else {
            c18449lMo1331package = mo1331package(enumC17969l);
            arrayList = new ArrayList();
            str = (String) c18449lMo1331package.f36012l;
            str2 = (String) c18449lMo1331package.f36009l;
            if (str != null) {
                it2 = appmetrica(str2).iterator();
                while (it2.hasNext()) {
                    abstractC16446l2 = ((AbstractC0231l) ((InterfaceC4656l) it2.next())).f5140l;
                    if (abstractC16446l2 instanceof FrameBodyTXXX) {
                        frameBodyTXXX = (FrameBodyTXXX) abstractC16446l2;
                        if (frameBodyTXXX.getDescription().equals(str)) {
                            arrayList.addAll(frameBodyTXXX.getValues());
                        }
                    } else if (abstractC16446l2 instanceof FrameBodyWXXX) {
                        frameBodyWXXX = (FrameBodyWXXX) abstractC16446l2;
                        if (frameBodyWXXX.getDescription().equals(str)) {
                            arrayList.addAll(frameBodyWXXX.getUrlLinks());
                        }
                    } else if (abstractC16446l2 instanceof FrameBodyCOMM) {
                        frameBodyCOMM = (FrameBodyCOMM) abstractC16446l2;
                        if (frameBodyCOMM.getDescription().equals(str)) {
                            arrayList.addAll(frameBodyCOMM.getValues());
                        }
                    } else if (abstractC16446l2 instanceof FrameBodyUFID) {
                        frameBodyUFID = (FrameBodyUFID) abstractC16446l2;
                        if (!frameBodyUFID.getOwner().equals(str)) {
                        }
                    } else {
                        if (abstractC16446l2 instanceof AbstractFrameBodyPairs) {
                            throw new C6451l("Need to implement getFields(FieldKey genericKey) for:" + abstractC16446l2.getClass(), 18, (byte) 0);
                        }
                        while (r6.hasNext()) {
                            if (!pair.getKey().equals(str)) {
                            }
                        }
                    }
                }
            } else {
                enumC17969l2 = (EnumC17969l) c18449lMo1331package.f36010l;
                if (enumC17969l2 == null) {
                    it = appmetrica(str2).iterator();
                    while (it.hasNext()) {
                        abstractC0231l = (AbstractC0231l) ((InterfaceC4656l) it.next());
                        if (abstractC0231l != null) {
                            abstractC16446l = abstractC0231l.f5140l;
                            if (abstractC16446l instanceof AbstractFrameBodyTextInfo) {
                                arrayList.addAll(((AbstractFrameBodyTextInfo) abstractC16446l).getValues());
                            } else {
                                arrayList.add(abstractC16446l.getUserFriendlyValue());
                            }
                        }
                    }
                } else {
                    it = appmetrica(str2).iterator();
                    while (it.hasNext()) {
                        abstractC0231l = (AbstractC0231l) ((InterfaceC4656l) it.next());
                        if (abstractC0231l != null) {
                            abstractC16446l = abstractC0231l.f5140l;
                            if (abstractC16446l instanceof AbstractFrameBodyTextInfo) {
                                arrayList.addAll(((AbstractFrameBodyTextInfo) abstractC16446l).getValues());
                            } else {
                                arrayList.add(abstractC16446l.getUserFriendlyValue());
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return AbstractC17238l.amazon(arrayList.get(0));
            }
        }
        return C1972l.f4482l;
    }

    @Override // defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) throws C9706l {
        boolean z = interfaceC4656l instanceof AbstractC0231l;
        if (!z && !(interfaceC4656l instanceof C5021l)) {
            throw new C9706l("Field " + interfaceC4656l + " is not of type AbstractID3v2Frame nor AggregatedFrame");
        }
        LinkedHashMap linkedHashMap = this.f7146l;
        if (!z) {
            linkedHashMap.put(interfaceC4656l.getId(), interfaceC4656l);
            return;
        }
        AbstractC0231l abstractC0231l = (AbstractC0231l) interfaceC4656l;
        Object obj = linkedHashMap.get(abstractC0231l.f1216l);
        if (obj == null) {
            this.f7146l.put(abstractC0231l.f1216l, interfaceC4656l);
            return;
        }
        if (obj instanceof AbstractC0231l) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((AbstractC0231l) obj);
            m1327extends(abstractC0231l, arrayList);
        } else if (obj instanceof List) {
            m1327extends(abstractC0231l, (List) obj);
        }
    }

    public final void signatures(C18449l c18449l) {
        List arrayList;
        String str = (String) c18449l.f36012l;
        String str2 = (String) c18449l.f36009l;
        if (str == null) {
            EnumC17969l enumC17969l = (EnumC17969l) c18449l.f36010l;
            if (enumC17969l == null || !(enumC17969l == EnumC17969l.PERFORMER || enumC17969l == EnumC17969l.INVOLVED_PERSON)) {
                if (str == null) {
                    m1328for(str2);
                    return;
                }
                return;
            }
            Iterator it = appmetrica(str2).iterator();
            while (it.hasNext()) {
                AbstractC16446l abstractC16446l = ((AbstractC0231l) ((InterfaceC4656l) it.next())).f5140l;
                if (abstractC16446l instanceof AbstractFrameBodyPairs) {
                    PairedTextEncodedStringNullTerminated.ValuePairs pairing = ((AbstractFrameBodyPairs) abstractC16446l).getPairing();
                    ListIterator<Pair> listIterator = pairing.getMapping().listIterator();
                    while (listIterator.hasNext()) {
                        if (((EnumC1699l) EnumC1699l.f4087l.get(listIterator.next().getKey())) == null) {
                            listIterator.remove();
                        }
                    }
                    if (pairing.getMapping().size() == 0) {
                        m1328for(str2);
                    }
                }
            }
            return;
        }
        Object obj = this.f7146l.get(str2);
        if (obj == null) {
            arrayList = new ArrayList();
        } else if (obj instanceof List) {
            arrayList = (List) obj;
        } else {
            if (!(obj instanceof AbstractC0231l)) {
                C18073l.license(AbstractC15560l.subscription(obj, "Found entry in frameMap that was not a frame or a list:"));
                return;
            }
            AbstractC12832l.loadAd(1, "arraySize");
            ArrayList arrayList2 = new ArrayList(AbstractC9966l.ads(6L));
            Collections.addAll(arrayList2, (InterfaceC4656l) obj);
            arrayList = arrayList2;
        }
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            AbstractC16446l abstractC16446l2 = ((AbstractC0231l) listIterator2.next()).f5140l;
            if (abstractC16446l2 instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC16446l2).getDescription().equals(str)) {
                    if (arrayList.size() == 1) {
                        m1328for(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC16446l2 instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC16446l2).getDescription().equals(str)) {
                    if (arrayList.size() == 1) {
                        m1328for(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC16446l2 instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC16446l2).getDescription().equals(str)) {
                    if (arrayList.size() == 1) {
                        m1328for(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC16446l2 instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC16446l2).getOwner().equals(str)) {
                    if (arrayList.size() == 1) {
                        m1328for(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC16446l2 instanceof FrameBodyTIPL) {
                PairedTextEncodedStringNullTerminated.ValuePairs pairing2 = ((FrameBodyTIPL) abstractC16446l2).getPairing();
                ListIterator<Pair> listIterator3 = pairing2.getMapping().listIterator();
                while (listIterator3.hasNext()) {
                    if (listIterator3.next().getKey().equals(str)) {
                        listIterator3.remove();
                    }
                }
                if (pairing2.getMapping().size() == 0) {
                    m1328for(str2);
                }
            } else {
                if (!(abstractC16446l2 instanceof FrameBodyIPLS)) {
                    throw new C6451l("Need to implement getFields(FieldKey genericKey) for:" + abstractC16446l2.getClass(), 18, (byte) 0);
                }
                PairedTextEncodedStringNullTerminated.ValuePairs pairing3 = ((FrameBodyIPLS) abstractC16446l2).getPairing();
                ListIterator<Pair> listIterator4 = pairing3.getMapping().listIterator();
                while (listIterator4.hasNext()) {
                    if (listIterator4.next().getKey().equals(str)) {
                        listIterator4.remove();
                    }
                }
                if (pairing3.getMapping().size() == 0) {
                    m1328for(str2);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        AbstractC0231l abstractC0231lPro = pro((String) mo1331package(EnumC17969l.COVER_ART).f36009l);
        AbstractC16446l abstractC16446l = abstractC0231lPro.f5140l;
        abstractC5859l.getClass();
        abstractC16446l.setObjectValue(DataTypes.OBJ_PICTURE_DATA, abstractC5859l.yandex);
        abstractC16446l.setObjectValue(DataTypes.OBJ_PICTURE_TYPE, Integer.valueOf(abstractC5859l.crashlytics));
        abstractC16446l.setObjectValue(applovin(), premium(abstractC5859l.loadAd));
        abstractC16446l.setObjectValue(DataTypes.OBJ_DESCRIPTION, "");
        return abstractC0231lPro;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public abstract Comparator mo1333strictfp();

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        return purchase(enumC17969l);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public abstract void mo1334switch(WritableByteChannel writableByteChannel, int i);

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public abstract AbstractC5232l mo1335synchronized();

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m1336throws(EnumC17969l enumC17969l) {
        return (String) purchase(enumC17969l).purchase("");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag content:\n");
        Iterator itIsPro = isPro();
        while (true) {
            C11506l c11506l = (C11506l) itIsPro;
            if (!c11506l.hasNext()) {
                return sb.toString();
            }
            InterfaceC4656l interfaceC4656l = (InterfaceC4656l) c11506l.next();
            sb.append("\t");
            sb.append(interfaceC4656l.getId());
            sb.append(":");
            sb.append(interfaceC4656l.toString());
            sb.append("\n");
        }
    }

    @Override // defpackage.InterfaceC15476l
    public InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) throws C9706l {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        String str = (String) AbstractC6745l.amazon(strArr, "values");
        C18449l c18449lMo1331package = mo1331package(enumC17969l);
        String str2 = (String) c18449lMo1331package.f36009l;
        if (AbstractC9403l.yandex.contains(enumC17969l)) {
            AbstractC0231l abstractC0231lPro = pro(str2);
            ((AbstractFrameBodyNumberTotal) abstractC0231lPro.f5140l).setNumber(str);
            return abstractC0231lPro;
        }
        if (AbstractC9403l.loadAd.contains(enumC17969l)) {
            AbstractC0231l abstractC0231lPro2 = pro(str2);
            ((AbstractFrameBodyNumberTotal) abstractC0231lPro2.f5140l).setTotal(str);
            return abstractC0231lPro2;
        }
        String str3 = strArr[0];
        String str4 = (String) c18449lMo1331package.f36012l;
        AbstractC0231l abstractC0231lPro3 = pro(str2);
        AbstractC16446l abstractC16446l = abstractC0231lPro3.f5140l;
        if (abstractC16446l instanceof FrameBodyUFID) {
            ((FrameBodyUFID) abstractC16446l).setOwner(str4);
            try {
                ((FrameBodyUFID) abstractC0231lPro3.f5140l).setUniqueIdentifier(str3.getBytes("ISO-8859-1"));
                return abstractC0231lPro3;
            } catch (UnsupportedEncodingException unused) {
                C18073l.license("When encoding UFID charset ISO-8859-1 was deemed unsupported");
                return null;
            }
        }
        if (abstractC16446l instanceof FrameBodyTXXX) {
            ((FrameBodyTXXX) abstractC16446l).setDescription(str4);
            ((FrameBodyTXXX) abstractC0231lPro3.f5140l).setText(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyWXXX) {
            ((FrameBodyWXXX) abstractC16446l).setDescription(str4);
            ((FrameBodyWXXX) abstractC0231lPro3.f5140l).setUrlLink(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyCOMM) {
            if (str4 != null) {
                ((FrameBodyCOMM) abstractC16446l).setDescription(str4);
                if (((FrameBodyCOMM) abstractC0231lPro3.f5140l).isMediaMonkeyFrame()) {
                    ((FrameBodyCOMM) abstractC0231lPro3.f5140l).setLanguage("XXX");
                }
            }
            ((FrameBodyCOMM) abstractC0231lPro3.f5140l).setText(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyUSLT) {
            ((FrameBodyUSLT) abstractC16446l).setDescription("");
            ((FrameBodyUSLT) abstractC0231lPro3.f5140l).setLyric(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyWOAR) {
            ((FrameBodyWOAR) abstractC16446l).setUrlLink(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof AbstractFrameBodyTextInfo) {
            ((AbstractFrameBodyTextInfo) abstractC16446l).setText(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyPOPM) {
            ((FrameBodyPOPM) abstractC16446l).parseString(str3);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyIPLS) {
            if (str4 != null) {
                ((FrameBodyIPLS) abstractC16446l).addPair(str4, str3);
                return abstractC0231lPro3;
            }
            if (strArr.length >= 2) {
                ((FrameBodyIPLS) abstractC16446l).addPair(strArr[0], strArr[1]);
                return abstractC0231lPro3;
            }
            ((FrameBodyIPLS) abstractC16446l).addPair(strArr[0]);
            return abstractC0231lPro3;
        }
        if (abstractC16446l instanceof FrameBodyTIPL) {
            ((FrameBodyTIPL) abstractC16446l).addPair(str4, str3);
            return abstractC0231lPro3;
        }
        if (!(abstractC16446l instanceof FrameBodyTMCL)) {
            if ((abstractC16446l instanceof FrameBodyAPIC) || (abstractC16446l instanceof FrameBodyPIC)) {
                throw new C6451l("Cover Art cannot be created using this method", 18, (byte) 0);
            }
            throw new C9706l(AbstractC14814l.adcel("Field with key of:", str2, ":does not accept cannot parse data:", str3));
        }
        if (strArr.length >= 2) {
            ((FrameBodyTMCL) abstractC16446l).addPair(strArr[0], strArr[1]);
            return abstractC0231lPro3;
        }
        ((FrameBodyTMCL) abstractC16446l).addPair(strArr[0]);
        return abstractC0231lPro3;
    }

    public String premium(String str) {
        return str;
    }
}
