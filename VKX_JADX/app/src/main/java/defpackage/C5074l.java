package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5074l extends C1109l {
    public final EnumC0678l amazon;
    public final C8063l billing;
    public final Hashtable purchase;

    public C5074l(EnumC0678l enumC0678l) {
        super(enumC0678l.f2165l, 0L, BigInteger.ZERO);
        this.purchase = new Hashtable();
        this.billing = new C8063l(new C12645l("", 0));
        this.amazon = enumC0678l;
    }

    public boolean admob(C12645l c12645l) {
        boolean zIsEmpty = this.amazon.yandex(c12645l.f24877l, c12645l.amazon(), c12645l.f24874l) == null;
        if (!zIsEmpty || this.amazon.f2167l) {
            return zIsEmpty;
        }
        synchronized (this.billing) {
            try {
                Hashtable hashtable = this.purchase;
                C8063l c8063l = this.billing;
                c8063l.yandex = c12645l;
                List list = (List) hashtable.get(c8063l);
                if (list != null) {
                    zIsEmpty = list.isEmpty();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsEmpty;
    }

    public long amazon() {
        Iterator it = purchase().iterator();
        long jYandex = 26;
        while (it.hasNext()) {
            jYandex += (long) ((C12645l) it.next()).yandex(this.amazon);
        }
        return jYandex;
    }

    public final ArrayList billing(String str) {
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = this.purchase;
        for (List list : DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable)) {
            if (!list.isEmpty() && ((C12645l) list.get(0)).f24877l.equals(str)) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public final C12645l crashlytics(int i, String str) {
        ArrayList arrayListBilling = billing(str);
        if (!arrayListBilling.isEmpty()) {
            return (C12645l) arrayListBilling.get(0);
        }
        C12645l c12645l = new C12645l(this.amazon, str, i, 0);
        loadAd(c12645l);
        return c12645l;
    }

    public long isPro(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr;
        long jAmazon = amazon();
        ArrayList<C12645l> arrayListPurchase = purchase();
        byteArrayOutputStream.write(this.loadAd.yandex());
        AbstractC3848l.subs(jAmazon, byteArrayOutputStream);
        AbstractC3848l.mopub(arrayListPurchase.size(), byteArrayOutputStream);
        for (C12645l c12645l : arrayListPurchase) {
            String str = c12645l.f24877l;
            EnumC0678l enumC0678l = this.amazon;
            c12645l.yandex(enumC0678l);
            if (c12645l.f24874l == 2) {
                bArr = new byte[enumC0678l == EnumC0678l.EXTENDED_CONTENT ? 4 : 2];
                byte[] bArr2 = c12645l.f24875l;
                bArr[0] = (byte) ((bArr2.length <= 0 || bArr2[0] == 0) ? 0 : 1);
            } else {
                bArr = c12645l.f24875l;
            }
            EnumC0678l enumC0678l2 = EnumC0678l.EXTENDED_CONTENT;
            if (enumC0678l != enumC0678l2) {
                AbstractC3848l.mopub(0, byteArrayOutputStream);
                AbstractC3848l.mopub(0, byteArrayOutputStream);
            }
            AbstractC3848l.mopub((str.length() * 2) + 2, byteArrayOutputStream);
            if (enumC0678l == enumC0678l2) {
                byteArrayOutputStream.write(AbstractC3848l.loadAd(str, C4616l.mopub));
                byteArrayOutputStream.write(C4616l.admob);
            }
            int i = c12645l.f24874l;
            AbstractC3848l.mopub(i, byteArrayOutputStream);
            int length = bArr.length;
            if (i == 0) {
                length += 2;
            }
            if (enumC0678l == enumC0678l2) {
                AbstractC3848l.mopub(length, byteArrayOutputStream);
            } else {
                AbstractC3848l.admob(length, byteArrayOutputStream);
            }
            if (enumC0678l != enumC0678l2) {
                byteArrayOutputStream.write(AbstractC3848l.loadAd(str, C4616l.mopub));
                byteArrayOutputStream.write(C4616l.admob);
            }
            byteArrayOutputStream.write(bArr);
            if (i == 0) {
                byteArrayOutputStream.write(C4616l.admob);
            }
        }
        return jAmazon;
    }

    public final void loadAd(C12645l c12645l) {
        List arrayList;
        IllegalArgumentException illegalArgumentExceptionYandex = this.amazon.yandex(c12645l.f24877l, c12645l.amazon(), c12645l.f24874l);
        if (illegalArgumentExceptionYandex != null) {
            throw illegalArgumentExceptionYandex;
        }
        if (!admob(c12645l)) {
            C8339l.metrica("Descriptor cannot be added, see isAddSupported(...)");
            return;
        }
        synchronized (this.billing) {
            Hashtable hashtable = this.purchase;
            C8063l c8063l = this.billing;
            c8063l.yandex = c12645l;
            arrayList = (List) hashtable.get(c8063l);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.purchase.put(new C8063l(c12645l), arrayList);
        } else if (!arrayList.isEmpty() && !this.amazon.f2167l) {
            C8339l.metrica("Container does not allow multiple values of descriptors with same name, language index and stream number");
            return;
        }
        arrayList.add(c12645l);
    }

    public final String mopub(String str) {
        ArrayList arrayListBilling = billing(str);
        return !arrayListBilling.isEmpty() ? ((C12645l) arrayListBilling.get(0)).purchase() : "";
    }

    public final ArrayList purchase() {
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = this.purchase;
        Iterator it = DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable).iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return arrayList;
    }

    public final boolean subs() {
        if (purchase().size() == 0) {
            return true;
        }
        Iterator it = purchase().iterator();
        boolean z = true;
        while (z && it.hasNext()) {
            z &= ((C12645l) it.next()).f24875l.length == 0;
        }
        return z;
    }

    @Override // defpackage.C1109l
    public String yandex(String str) {
        StringBuilder sb = new StringBuilder(super.yandex(str));
        for (C12645l c12645l : purchase()) {
            sb.append(str);
            sb.append("  |-> ");
            sb.append(c12645l);
            sb.append(AbstractC3848l.yandex);
        }
        return sb.toString();
    }
}
