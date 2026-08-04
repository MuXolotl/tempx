package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lۣؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0669l {
    public boolean amazon;
    public final AbstractC1186l yandex;
    public final ArrayList loadAd = new ArrayList();
    public ByteBuffer[] crashlytics = new ByteBuffer[0];

    public C0669l(AbstractC1186l abstractC1186l) {
        this.yandex = abstractC1186l;
        C6696l c6696l = C6696l.purchase;
        this.amazon = false;
    }

    public final boolean amazon() {
        return !this.loadAd.isEmpty();
    }

    public final boolean crashlytics() {
        return this.amazon && ((InterfaceC15103l) this.loadAd.get(loadAd())).admob() && !this.crashlytics[loadAd()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0669l)) {
            return false;
        }
        AbstractC1186l abstractC1186l = ((C0669l) obj).yandex;
        AbstractC1186l abstractC1186l2 = this.yandex;
        if (abstractC1186l2.size() != abstractC1186l.size()) {
            return false;
        }
        for (int i = 0; i < abstractC1186l2.size(); i++) {
            if (abstractC1186l2.get(i) != abstractC1186l.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final int loadAd() {
        return this.crashlytics.length - 1;
    }

    public final void purchase(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= loadAd(); i++) {
                if (!this.crashlytics[i].hasRemaining()) {
                    ArrayList arrayList = this.loadAd;
                    InterfaceC15103l interfaceC15103l = (InterfaceC15103l) arrayList.get(i);
                    if (!interfaceC15103l.admob()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.crashlytics[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC15103l.yandex;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC15103l.firebase(byteBuffer2);
                        this.crashlytics[i] = interfaceC15103l.subs();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.crashlytics[i].hasRemaining();
                    } else if (!this.crashlytics[i].hasRemaining() && i < loadAd()) {
                        ((InterfaceC15103l) arrayList.get(i + 1)).remoteconfig();
                    }
                }
            }
        }
    }

    public final void yandex() {
        C4388l c4388l = C4388l.loadAd;
        ArrayList arrayList = this.loadAd;
        arrayList.clear();
        this.amazon = false;
        long jVip = c4388l.yandex;
        int i = 0;
        while (true) {
            AbstractC1186l abstractC1186l = this.yandex;
            if (i >= abstractC1186l.size()) {
                break;
            }
            InterfaceC15103l interfaceC15103l = (InterfaceC15103l) abstractC1186l.get(i);
            interfaceC15103l.isPro(new C4388l(jVip));
            if (interfaceC15103l.mopub()) {
                jVip = interfaceC15103l.vip(jVip);
                AbstractC12442l.subscription(jVip >= 0);
                arrayList.add(interfaceC15103l);
            }
            i++;
        }
        this.crashlytics = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= loadAd(); i2++) {
            this.crashlytics[i2] = ((InterfaceC15103l) arrayList.get(i2)).subs();
        }
    }
}
