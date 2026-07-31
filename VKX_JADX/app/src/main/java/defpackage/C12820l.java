package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lّۙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12820l {
    public static final AtomicReferenceFieldUpdater[] yandex;
    private volatile InterfaceC4305l acceptHandlerReference;
    private volatile InterfaceC4305l connectHandlerReference;
    private volatile InterfaceC4305l readHandlerReference;
    private volatile InterfaceC4305l writeHandlerReference;

    static {
        InterfaceC6902l interfaceC6902l;
        EnumC14535l[] enumC14535lArr = EnumC14535l.f28461l;
        EnumC14535l[] enumC14535lArr2 = EnumC14535l.f28461l;
        ArrayList arrayList = new ArrayList(enumC14535lArr2.length);
        for (EnumC14535l enumC14535l : enumC14535lArr2) {
            int iOrdinal = enumC14535l.ordinal();
            if (iOrdinal == 0) {
                interfaceC6902l = C2543l.f5540l;
            } else if (iOrdinal == 1) {
                interfaceC6902l = C6733l.f14100l;
            } else if (iOrdinal == 2) {
                interfaceC6902l = C5442l.f11670l;
            } else {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return;
                }
                interfaceC6902l = C3447l.f7321l;
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(C12820l.class, InterfaceC4305l.class, interfaceC6902l.getName()));
        }
        yandex = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
