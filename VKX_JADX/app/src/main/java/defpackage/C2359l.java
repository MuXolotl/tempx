package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؔؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2359l extends AbstractC3352l {
    public static final C17925l crashlytics;
    public static final C13975l loadAd;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
        crashlytics = new C17925l(1);
    }

    public final ByteBuffer billing(InterfaceC13280l interfaceC13280l, int i) {
        ByteBuffer byteBufferBilling;
        int iLimit;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i2 = C17500l.yandex;
        C13188l c13188l = (C13188l) interfaceC13280l;
        C4391l c4391l = c13188l.f25800l;
        ArrayList arrayList = c13188l.f25799l;
        if (c4391l != null) {
            byteBufferBilling = crashlytics.billing(c4391l, 0);
            iLimit = byteBufferBilling.capacity() + 4;
        } else {
            byteBufferBilling = null;
            iLimit = 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iLimit += ((C1562l) it.next()).loadAd().limit() + 4;
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i3 = C17500l.yandex;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit + i);
        if (c13188l.f25800l != null) {
            EnumC2692l enumC2692l = EnumC2692l.VORBIS_COMMENT;
            byteBufferAllocate.put((byte[]) ((i > 0 || arrayList.size() > 0) ? new C8662l(false, enumC2692l, byteBufferBilling.capacity()) : new C8662l(true, enumC2692l, byteBufferBilling.capacity())).amazon);
            byteBufferAllocate.put(byteBufferBilling);
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C1562l c1562l = (C1562l) listIterator.next();
            EnumC2692l enumC2692l2 = EnumC2692l.PICTURE;
            byteBufferAllocate.put((byte[]) ((i > 0 || listIterator.hasNext()) ? new C8662l(false, enumC2692l2, c1562l.loadAd().limit()) : new C8662l(true, enumC2692l2, c1562l.loadAd().limit())).amazon);
            byteBufferAllocate.put(c1562l.loadAd());
        }
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        byteBufferAllocate.position();
        c13975l.getClass();
        int i4 = C17500l.yandex;
        if (i > 0) {
            int i5 = i - 4;
            byteBufferAllocate.put((byte[]) new C8662l(true, EnumC2692l.PADDING, i5).amazon);
            byteBufferAllocate.put(ByteBuffer.allocate(i5));
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }
}
