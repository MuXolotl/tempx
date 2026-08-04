package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖٞؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16528l implements InterfaceC17732l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f32302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f32303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32304l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f32305l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f32306l;

    public C16528l(C8043l c8043l, long j) {
        this.f32304l = 3;
        this.f32305l = c8043l;
        this.f32302l = new LinkedHashMap(0, 0.75f, true);
        this.f32303l = j;
        if (j > 0) {
            return;
        }
        C8339l.metrica("maxSize <= 0");
        throw null;
    }

    public void admob(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32302l;
        while (purchase() > j) {
            if (linkedHashMap.isEmpty()) {
                if (purchase() == 0) {
                    return;
                }
                C8339l.smaato("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) AbstractC16901l.m4248volatile(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.f32306l = purchase() - mopub(key, value);
                loadAd(key, value, null);
            }
        }
    }

    @Override // defpackage.InterfaceC17732l
    public void amazon(long j) {
        long[] jArr = (long[]) ((C18595l) this.f32305l).f36317l;
        this.f32306l = jArr[AbstractC15323l.billing(jArr, j, true)];
    }

    public void billing(FileChannel fileChannel) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        this.f32306l = fileChannel.position();
        fileChannel.read(byteBufferAllocate);
        byteBufferAllocate.order((ByteOrder) this.f32305l);
        byteBufferAllocate.position(0);
        this.f32302l = AbstractC14375l.isPro(byteBufferAllocate);
        this.f32303l = byteBufferAllocate.getInt();
    }

    @Override // defpackage.InterfaceC17732l
    public InterfaceC12703l crashlytics() {
        AbstractC12442l.subscription(this.f32303l != -1);
        return new C9828l((C5478l) this.f32302l, this.f32303l, 1);
    }

    public void loadAd(Object obj, Object obj2, C9178l c9178l) {
        C9178l c9178l2 = (C9178l) obj2;
        ((C14785l) ((C8043l) this.f32305l).f16742l).advert((C1791l) obj, c9178l2.yandex, c9178l2.loadAd, c9178l2.crashlytics);
    }

    public long mopub(Object obj, Object obj2) throws Exception {
        try {
            long j = ((C9178l) obj2).crashlytics;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.f32306l = -1L;
            throw e;
        }
    }

    public long purchase() {
        if (this.f32306l == -1) {
            long jMopub = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f32302l).entrySet()) {
                jMopub += mopub(entry.getKey(), entry.getValue());
            }
            this.f32306l = jMopub;
        }
        return this.f32306l;
    }

    public boolean subs(long j, boolean z, boolean z2) {
        C11569l c11569l = (C11569l) this.f32305l;
        c11569l.mo211l();
        c11569l.m2935l();
        C17417l c17417l = (C17417l) c11569l.f833l;
        boolean zYandex = c17417l.yandex();
        C8118l c8118l = c17417l.f33950l;
        if (zYandex) {
            C16386l c16386l = c17417l.f33944l;
            C17417l.billing(c16386l);
            C3071l c3071l = c16386l.f32049l;
            c17417l.f33951l.getClass();
            c3071l.purchase(System.currentTimeMillis());
        }
        long j2 = j - this.f32303l;
        if (!z && j2 < 1000) {
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f32306l;
            this.f32306l = j;
        }
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !c17417l.f33945l.m1677l();
        C3148l c3148l = c17417l.f33948l;
        C17417l.mopub(c3148l);
        C17410l.m4338l(c3148l.m1294l(z3), bundle, true);
        if (!z2) {
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3196l("auto", "_e", bundle);
        }
        this.f32303l = j;
        C1576l c1576l = (C1576l) this.f32302l;
        c1576l.crashlytics();
        c1576l.loadAd(((Long) AbstractC5981l.f12692l.yandex(null)).longValue());
        return true;
    }

    public String toString() {
        switch (this.f32304l) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("ChunkHeader{, id='");
                sb.append((String) this.f32302l);
                sb.append("', startLocationInFile=");
                sb.append(this.f32306l);
                sb.append("size=");
                sb.append(this.f32303l);
                sb.append(" sizeIncludingHeader=");
                return AbstractC12900l.smaato(sb, this.f32303l + 8, '}');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17732l
    public long yandex(InterfaceC10430l interfaceC10430l) {
        long j = this.f32306l;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f32306l = -1L;
        return j2;
    }

    public C16528l(C11569l c11569l) {
        this.f32304l = 5;
        this.f32305l = c11569l;
        C17417l c17417l = (C17417l) c11569l.f833l;
        this.f32302l = new C1576l(this, c17417l, 0);
        c17417l.f33951l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f32303l = jElapsedRealtime;
        this.f32306l = jElapsedRealtime;
    }

    public C16528l(ByteOrder byteOrder) {
        this.f32304l = 1;
        this.f32305l = byteOrder;
    }

    public C16528l(long j, int i) {
        this.f32304l = 4;
        AbstractC12442l.subscription(((C8099l) this.f32302l) == null);
        this.f32303l = j;
        this.f32306l = j + ((long) i);
    }

    public C16528l(String str, byte[] bArr, long j, long j2) {
        this.f32304l = 0;
        this.f32302l = str;
        this.f32305l = bArr;
        this.f32303l = j;
        this.f32306l = j2;
    }
}
