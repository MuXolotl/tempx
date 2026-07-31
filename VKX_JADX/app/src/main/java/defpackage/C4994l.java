package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؗٚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4994l extends AbstractC12972l {
    public final Object amazon;
    public final C5254l crashlytics;
    public final long loadAd;
    public final /* synthetic */ int yandex = 0;

    public C4994l(InterfaceC14665l interfaceC14665l) throws IOException {
        Set<Map.Entry> setMopub = interfaceC14665l.mopub();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setMopub) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C8195l(entry.getKey(), (String) it.next()));
            }
            AbstractC3984l.license(arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder();
        AbstractC16901l.m4216else(arrayList, sb, "&", null, null, new C17049l(20), 60);
        String string = sb.toString();
        Charset charset = AbstractC9050l.yandex;
        byte[] bArrSmaato = C17423l.smaato(string, charset);
        this.amazon = bArrSmaato;
        this.loadAd = bArrSmaato.length;
        C5254l c5254l = AbstractC14192l.crashlytics;
        int i = AbstractC15755l.yandex;
        this.crashlytics = c5254l.m1756l(charset.name());
    }

    @Override // defpackage.AbstractC8870l
    public final C5254l loadAd() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC12972l
    public final byte[] purchase() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return (byte[]) this.amazon;
    }

    @Override // defpackage.AbstractC8870l
    public final Long yandex() {
        int i = this.yandex;
        long j = this.loadAd;
        switch (i) {
            case 0:
                break;
        }
        return Long.valueOf(j);
    }

    public C4994l(C5254l c5254l, Object obj) {
        this.amazon = obj;
        if (c5254l == null) {
            C5254l c5254l2 = AbstractC14192l.yandex;
            c5254l = AbstractC14192l.loadAd;
        }
        this.crashlytics = c5254l;
        this.loadAd = ((byte[]) obj).length;
    }
}
