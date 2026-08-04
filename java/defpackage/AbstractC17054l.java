package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17054l implements InterfaceC15177l, InterfaceC2226l, InterfaceC17603l, InterfaceC18477l, InterfaceC9814l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f33214l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f33215l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33216l;

    public AbstractC17054l(InputStream inputStream) {
        this.f33216l = 4;
        EnumC6690l enumC6690l = EnumC6690l.f14038l;
        EnumC6690l enumC6690l2 = EnumC6690l.f14038l;
        C1298l c1298l = new C1298l();
        c1298l.f3349l = new StringBuilder();
        c1298l.f3346l = new Scanner(inputStream, "utf-8").useLocale(Locale.US).useDelimiter("\\r?\\n");
        c1298l.f3348l = true;
        this.f33215l = c1298l;
        this.f33214l = enumC6690l;
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public static byte[] m4253l(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // defpackage.InterfaceC9814l
    public void Signature(InterfaceC13521l interfaceC13521l) {
        synchronized (((IdentityHashMap) this.f33214l)) {
            try {
                C16062l c16062l = (C16062l) ((IdentityHashMap) this.f33214l).get(interfaceC13521l);
                if (c16062l == null) {
                    c16062l = new C16062l(this, interfaceC13521l);
                }
                ((InterfaceC9814l) this.f33215l).Signature(c16062l);
                ((IdentityHashMap) this.f33214l).put(interfaceC13521l, c16062l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC17603l
    /* JADX INFO: renamed from: abstract */
    public InterfaceC7832l mo875abstract() {
        return remoteconfig();
    }

    @Override // defpackage.InterfaceC9814l
    public int ad() {
        return ((InterfaceC9814l) this.f33215l).ad();
    }

    @Override // defpackage.InterfaceC9814l
    public void adcel() {
        ((InterfaceC9814l) this.f33215l).adcel();
    }

    @Override // defpackage.InterfaceC9814l
    public int admob() {
        return ((InterfaceC9814l) this.f33215l).admob();
    }

    @Override // defpackage.InterfaceC9814l
    public void ads(boolean z) {
        ((InterfaceC9814l) this.f33215l).ads(z);
    }

    @Override // defpackage.InterfaceC9814l
    public C15074l advert() {
        return ((InterfaceC9814l) this.f33215l).advert();
    }

    @Override // defpackage.InterfaceC9814l
    public boolean amazon() {
        return ((InterfaceC9814l) this.f33215l).amazon();
    }

    @Override // defpackage.InterfaceC9814l
    public C13736l applovin() {
        return ((InterfaceC9814l) this.f33215l).applovin();
    }

    @Override // defpackage.InterfaceC9814l
    public void appmetrica(int i, boolean z) {
        ((InterfaceC9814l) this.f33215l).appmetrica(i, z);
    }

    @Override // defpackage.InterfaceC9814l
    public C1372l billing() {
        return ((InterfaceC9814l) this.f33215l).billing();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: break */
    public void mo2748break(C13736l c13736l, boolean z) {
        ((InterfaceC9814l) this.f33215l).mo2748break(c13736l, z);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: case */
    public void mo2749case() {
        ((InterfaceC9814l) this.f33215l).mo2749case();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: catch */
    public void mo2750catch(SurfaceHolder surfaceHolder) {
        ((InterfaceC9814l) this.f33215l).mo2750catch(surfaceHolder);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: class */
    public void mo2751class(int i) {
        ((InterfaceC9814l) this.f33215l).mo2751class(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: const */
    public void mo2752const(int i) {
        ((InterfaceC9814l) this.f33215l).mo2752const(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: continue */
    public void mo2753continue(boolean z) {
        ((InterfaceC9814l) this.f33215l).mo2753continue(z);
    }

    @Override // defpackage.InterfaceC9814l
    public void crashlytics(float f) {
        ((InterfaceC9814l) this.f33215l).crashlytics(f);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: default */
    public void mo2754default(int i, List list) {
        ((InterfaceC9814l) this.f33215l).mo2754default(i, list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: else */
    public void mo2755else(float f) {
        ((InterfaceC9814l) this.f33215l).mo2755else(f);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: extends */
    public void mo2756extends(int i) {
        ((InterfaceC9814l) this.f33215l).mo2756extends(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: final */
    public void mo2757final() {
        ((InterfaceC9814l) this.f33215l).mo2757final();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: finally */
    public boolean mo2758finally() {
        return ((InterfaceC9814l) this.f33215l).mo2758finally();
    }

    @Override // defpackage.InterfaceC9814l
    public long firebase() {
        return ((InterfaceC9814l) this.f33215l).firebase();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: for */
    public void mo2759for(long j) {
        ((InterfaceC9814l) this.f33215l).mo2759for(j);
    }

    @Override // defpackage.InterfaceC9814l
    public long getDuration() {
        return ((InterfaceC9814l) this.f33215l).getDuration();
    }

    /* JADX INFO: renamed from: goto */
    public void mo2760goto() {
        ((InterfaceC9814l) this.f33215l).mo2760goto();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: implements */
    public int mo2761implements() {
        return ((InterfaceC9814l) this.f33215l).mo2761implements();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: import */
    public C1047l mo2762import() {
        return ((InterfaceC9814l) this.f33215l).mo2762import();
    }

    @Override // defpackage.InterfaceC9814l
    public C2848l inmobi() {
        return ((InterfaceC9814l) this.f33215l).inmobi();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: instanceof */
    public boolean mo2763instanceof() {
        return ((InterfaceC9814l) this.f33215l).mo2763instanceof();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: interface */
    public long mo2764interface() {
        return ((InterfaceC9814l) this.f33215l).mo2764interface();
    }

    public boolean isClosed() {
        return remoteconfig().isClosed();
    }

    @Override // defpackage.InterfaceC9814l
    public long isPro() {
        return ((InterfaceC9814l) this.f33215l).isPro();
    }

    @Override // defpackage.InterfaceC9814l
    public void isVip() {
        ((InterfaceC9814l) this.f33215l).isVip();
    }

    @Override // defpackage.InterfaceC9814l
    public int license() {
        return ((InterfaceC9814l) this.f33215l).license();
    }

    @Override // defpackage.InterfaceC9814l
    public void loadAd(C1372l c1372l) {
        ((InterfaceC9814l) this.f33215l).loadAd(c1372l);
    }

    /* JADX INFO: renamed from: lؑؓۙ */
    public abstract void mo1361l(long[] jArr, long[] jArr2);

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public boolean m4254l() {
        return ((C4983l) this.f33215l).loadAd && ((C11541l) this.f33214l).yandex();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۣؒ */
    public void mo2765l() {
        ((InterfaceC9814l) this.f33215l).mo2765l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lۣؒٞ */
    public C4970l mo2766l() {
        return ((InterfaceC9814l) this.f33215l).mo2766l();
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public MenuItem m4255l(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC5349l)) {
            return menuItem;
        }
        InterfaceMenuItemC5349l interfaceMenuItemC5349l = (InterfaceMenuItemC5349l) menuItem;
        if (((C5128l) this.f33214l) == null) {
            this.f33214l = new C5128l(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C5128l) this.f33214l).get(interfaceMenuItemC5349l);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC12957l menuItemC12957l = new MenuItemC12957l((Context) this.f33215l, interfaceMenuItemC5349l);
        ((C5128l) this.f33214l).put(interfaceMenuItemC5349l, menuItemC12957l);
        return menuItemC12957l;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؒۢۜ */
    public void mo2767l(C2427l c2427l) {
        ((InterfaceC9814l) this.f33215l).mo2767l(c2427l);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public Object mo2330l() {
        return (AbstractC11904l) this.f33214l;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public void mo2768l(List list) {
        ((InterfaceC9814l) this.f33215l).mo2768l(list);
    }

    @Override // defpackage.InterfaceC2226l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public C10821l mo876l() {
        return AbstractC4338l.metrica(this);
    }

    /* JADX INFO: renamed from: lٕؓۡ */
    public abstract void mo1362l(long[] jArr, long[] jArr2);

    /* JADX INFO: renamed from: lؓۤٚ */
    public abstract IntentFilter mo2327l();

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙؔؑ */
    public void mo2769l(List list) {
        ((InterfaceC9814l) this.f33215l).mo2769l(list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؔٙؕ */
    public int mo2770l() {
        return ((InterfaceC9814l) this.f33215l).mo2770l();
    }

    /* JADX INFO: renamed from: lؖٔؓ */
    public abstract boolean mo1010l();

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            AbstractC7532l abstractC7532l = (AbstractC7532l) this.f33215l;
            abstractC7532l.getClass();
            return abstractC7532l.crashlytics(new C7084l(new C1503l(AbstractC7709l.purchase(inputStream))));
        } catch (ProtocolException e) {
            throw new C16916l("Protobuf parsing error", e);
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ */
    public abstract int[] mo3082l(int i);

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lّؗؑ */
    public long mo2771l() {
        return ((InterfaceC9814l) this.f33215l).mo2771l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘِٞ */
    public void mo2772l(int i) {
        ((InterfaceC9814l) this.f33215l).mo2772l(i);
    }

    /* JADX INFO: renamed from: lؘٞۨ */
    public abstract AbstractC15029l mo2825l(int i, byte[] bArr);

    /* JADX INFO: renamed from: lؘۦۧ */
    public InterfaceC6942l mo1733l(InterfaceC13077l interfaceC13077l, C8195l c8195l) {
        throw new UnsupportedOperationException("Observing changes are not supported by this Realm.");
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public void m4256l() {
        C11879l c11879l = (C11879l) this.f33215l;
        c11879l.getClass();
        if (C11879l.loadAd.decrementAndGet(c11879l) == 0) {
            ((C9426l) this.f33214l).m3885new(new C14845l(new C3722l(2)));
            release();
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗۛ */
    public void mo2773l() {
        ((InterfaceC9814l) this.f33215l).mo2773l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public C3852l mo2774l() {
        return ((InterfaceC9814l) this.f33215l).mo2774l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍؚۖ */
    public long mo2775l() {
        return ((InterfaceC9814l) this.f33215l).mo2775l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public void mo2776l(C2427l c2427l) {
        ((InterfaceC9814l) this.f33215l).mo2776l(c2427l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًَٙ */
    public boolean mo2777l() {
        return ((InterfaceC9814l) this.f33215l).mo2777l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lًٚٔ */
    public C2427l mo2778l() {
        return ((InterfaceC9814l) this.f33215l).mo2778l();
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public Unit mo2332l(OutputStream outputStream, Object obj) {
        ((AbstractC7532l) this.f33215l).mopub(outputStream, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public void m4257l() {
        m4258l();
        IntentFilter intentFilterMo2327l = mo2327l();
        if (intentFilterMo2327l.countActions() == 0) {
            return;
        }
        if (((C13773l) this.f33215l) == null) {
            this.f33215l = new C13773l(1, this);
        }
        ((LayoutInflaterFactory2C14405l) this.f33214l).f28206l.registerReceiver((C13773l) this.f33215l, intentFilterMo2327l);
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public void m4258l() {
        C13773l c13773l = (C13773l) this.f33215l;
        if (c13773l != null) {
            try {
                ((LayoutInflaterFactory2C14405l) this.f33214l).f28206l.unregisterReceiver(c13773l);
            } catch (IllegalArgumentException unused) {
            }
            this.f33215l = null;
        }
    }

    /* JADX INFO: renamed from: lٍ۟ۨ */
    public abstract void mo2013l();

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍۤٙ */
    public boolean mo2779l(int i) {
        return ((InterfaceC9814l) this.f33215l).mo2779l(i);
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public String m4259l(String str) {
        List list = (List) this.f33214l;
        int iSmaato = AbstractC14055l.smaato(list);
        if (iSmaato < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C14345l c14345l = (C14345l) list.get(i);
            if (AbstractC16648l.license(c14345l.yandex, str, true)) {
                return c14345l.loadAd;
            }
            if (i == iSmaato) {
                return null;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lُٔۨ */
    public Looper mo2780l() {
        return ((InterfaceC9814l) this.f33215l).mo2780l();
    }

    /* JADX INFO: renamed from: lِۙٞ */
    public abstract int[] mo3083l(int i);

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘْؒ */
    public void mo2781l(int i, long j, List list) {
        ((InterfaceC9814l) this.f33215l).mo2781l(i, j, list);
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public byte[] m4260l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC15029l) this.f33214l).yandex(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC11342l.purchase(bArr4, m4253l(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC15029l abstractC15029l = (AbstractC15029l) this.f33215l;
            abstractC15029l.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC15029l.adcel(byteBufferAllocate, byteBuffer, bArr);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؚْٟ */
    public long mo2782l() {
        return ((InterfaceC9814l) this.f33215l).mo2782l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٓؒ */
    public boolean mo2783l() {
        return ((InterfaceC9814l) this.f33215l).mo2783l();
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public int[] m4261l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f33214l;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public void mo2784l(int i, C2427l c2427l) {
        ((InterfaceC9814l) this.f33215l).mo2784l(i, c2427l);
    }

    /* JADX INFO: renamed from: lْۥٞ */
    public void mo2785l() {
        ((InterfaceC9814l) this.f33215l).mo2785l();
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public void m4262l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            C8339l.metrica("Given ByteBuffer output is too small");
            return;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.f33215l;
        abstractC15029l.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            C8339l.metrica("Given ByteBuffer output is too small");
            return;
        }
        abstractC15029l.adcel(byteBuffer, ByteBuffer.wrap(bArr2), bArr);
        int iPosition2 = byteBuffer.position();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iPosition2);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferYandex = ((AbstractC15029l) this.f33214l).yandex(0, bArr);
        byte[] bArr4 = new byte[32];
        byteBufferYandex.get(bArr4);
        byte[] bArrPurchase = AbstractC11342l.purchase(bArr4, m4253l(bArr3, byteBuffer));
        byteBuffer.limit(iLimit);
        byteBuffer.position(iPosition2);
        byteBuffer.put(bArrPurchase);
    }

    /* JADX INFO: renamed from: lٔ٘۠ */
    public abstract int mo2328l();

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٔٙٝ */
    public void mo2786l() {
        ((InterfaceC9814l) this.f33215l).mo2786l();
    }

    /* JADX INFO: renamed from: lًٔۘ */
    public abstract void mo2329l();

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public void mo2787l() {
        ((InterfaceC9814l) this.f33215l).mo2787l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕؓٗ */
    public boolean mo2788l() {
        return ((InterfaceC9814l) this.f33215l).mo2788l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٕۗٞ */
    public boolean mo2789l() {
        return ((InterfaceC9814l) this.f33215l).mo2789l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؔ */
    public void mo2790l(int i, int i2, int i3) {
        ((InterfaceC9814l) this.f33215l).mo2790l(i, i2, i3);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lَٖؕ */
    public AbstractC10759l mo2791l() {
        return ((InterfaceC9814l) this.f33215l).mo2791l();
    }

    @Override // defpackage.InterfaceC13092l
    /* JADX INFO: renamed from: lٖۡٓ */
    public boolean mo879l() {
        return AbstractC4338l.subs(this);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lٖۥۡ */
    public int mo2792l() {
        return ((InterfaceC9814l) this.f33215l).mo2792l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؘٗۦ */
    public boolean mo2793l() {
        return ((InterfaceC9814l) this.f33215l).mo2793l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lْٗٔ */
    public boolean mo2794l() {
        return ((InterfaceC9814l) this.f33215l).mo2794l();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: lؙٗٙ */
    public void mo2795l(int i, int i2) {
        ((InterfaceC9814l) this.f33215l).mo2795l(i, i2);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public void mo2796l(InterfaceC13521l interfaceC13521l) {
        synchronized (((IdentityHashMap) this.f33214l)) {
            InterfaceC13521l interfaceC13521l2 = (InterfaceC13521l) ((IdentityHashMap) this.f33214l).remove(interfaceC13521l);
            InterfaceC9814l interfaceC9814l = (InterfaceC9814l) this.f33215l;
            if (interfaceC13521l2 != null) {
                interfaceC13521l = interfaceC13521l2;
            }
            interfaceC9814l.mo2796l(interfaceC13521l);
        }
    }

    @Override // defpackage.InterfaceC9814l
    public void metrica(C2427l c2427l, long j) {
        ((InterfaceC9814l) this.f33215l).metrica(c2427l, j);
    }

    @Override // defpackage.InterfaceC9814l
    public int mopub() {
        return ((InterfaceC9814l) this.f33215l).mopub();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: native */
    public void mo2797native(int i, int i2, List list) {
        ((InterfaceC9814l) this.f33215l).mo2797native(i, i2, list);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: new */
    public long mo2798new() {
        return ((InterfaceC9814l) this.f33215l).mo2798new();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: package */
    public void mo2799package(int i, int i2) {
        ((InterfaceC9814l) this.f33215l).mo2799package(i, i2);
    }

    @Override // defpackage.InterfaceC9814l
    public void premium() {
        ((InterfaceC9814l) this.f33215l).premium();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: private */
    public void mo2800private(C4970l c4970l) {
        ((InterfaceC9814l) this.f33215l).mo2800private(c4970l);
    }

    @Override // defpackage.InterfaceC9814l
    public long pro() {
        return ((InterfaceC9814l) this.f33215l).pro();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: protected */
    public void mo2801protected() {
        ((InterfaceC9814l) this.f33215l).mo2801protected();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: public */
    public C3852l mo2802public() {
        return ((InterfaceC9814l) this.f33215l).mo2802public();
    }

    @Override // defpackage.InterfaceC9814l
    public int purchase() {
        return ((InterfaceC9814l) this.f33215l).purchase();
    }

    public void release() {
        ((InterfaceC9814l) this.f33215l).release();
    }

    public abstract InterfaceC7832l remoteconfig();

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: return */
    public void mo2803return(boolean z) {
        ((InterfaceC9814l) this.f33215l).mo2803return(z);
    }

    @Override // defpackage.InterfaceC9814l
    public float signatures() {
        return ((InterfaceC9814l) this.f33215l).signatures();
    }

    @Override // defpackage.InterfaceC9814l
    public void smaato(int i, long j) {
        ((InterfaceC9814l) this.f33215l).smaato(i, j);
    }

    @Override // defpackage.InterfaceC9814l
    public boolean startapp() {
        return ((InterfaceC9814l) this.f33215l).startapp();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: static */
    public long mo2804static() {
        return ((InterfaceC9814l) this.f33215l).mo2804static();
    }

    @Override // defpackage.InterfaceC9814l
    public void stop() {
        ((InterfaceC9814l) this.f33215l).stop();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: strictfp */
    public int mo2805strictfp() {
        return ((InterfaceC9814l) this.f33215l).mo2805strictfp();
    }

    @Override // defpackage.InterfaceC9814l
    public boolean subs() {
        return ((InterfaceC9814l) this.f33215l).subs();
    }

    @Override // defpackage.InterfaceC9814l
    public int subscription() {
        return ((InterfaceC9814l) this.f33215l).subscription();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: super */
    public void mo2806super(int i) {
        ((InterfaceC9814l) this.f33215l).mo2806super(i);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: switch */
    public C14723l mo2807switch() {
        return ((InterfaceC9814l) this.f33215l).mo2807switch();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: synchronized */
    public void mo2808synchronized(int i) {
        ((InterfaceC9814l) this.f33215l).mo2808synchronized(i);
    }

    @Override // defpackage.InterfaceC9814l
    public long tapsense() {
        return ((InterfaceC9814l) this.f33215l).tapsense();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: this */
    public C16684l mo2809this() {
        return ((InterfaceC9814l) this.f33215l).mo2809this();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throw */
    public void mo2810throw(int i, int i2) {
        ((InterfaceC9814l) this.f33215l).mo2810throw(i, i2);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: throws */
    public void mo2811throws() {
        ((InterfaceC9814l) this.f33215l).mo2811throws();
    }

    public String toString() {
        switch (this.f33216l) {
            case 6:
                return AbstractC18202l.yandex.loadAd(getClass()).license() + "[" + ((C12125l) this.f33215l).crashlytics + "}]";
            case 11:
                List<C14345l> list = (List) this.f33214l;
                boolean zIsEmpty = list.isEmpty();
                String str = (String) this.f33215l;
                if (zIsEmpty) {
                    return str;
                }
                int length = str.length();
                int i = 0;
                int length2 = 0;
                for (C14345l c14345l : list) {
                    length2 += c14345l.loadAd.length() + c14345l.yandex.length() + 3;
                }
                StringBuilder sb = new StringBuilder(length + length2);
                sb.append(str);
                int iSmaato = AbstractC14055l.smaato(list);
                if (iSmaato >= 0) {
                    while (true) {
                        C14345l c14345l2 = (C14345l) list.get(i);
                        sb.append("; ");
                        sb.append(c14345l2.yandex);
                        sb.append("=");
                        String str2 = c14345l2.loadAd;
                        if (AbstractC16866l.yandex(str2)) {
                            sb.append(AbstractC16866l.loadAd(str2));
                        } else {
                            sb.append(str2);
                        }
                        if (i != iSmaato) {
                            i++;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: transient */
    public void mo2812transient(C3852l c3852l) {
        ((InterfaceC9814l) this.f33215l).mo2812transient(c3852l);
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: try */
    public int mo2813try() {
        return ((InterfaceC9814l) this.f33215l).mo2813try();
    }

    @Override // defpackage.InterfaceC9814l
    public C16616l vip() {
        return ((InterfaceC9814l) this.f33215l).vip();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: volatile */
    public void mo2814volatile() {
        ((InterfaceC9814l) this.f33215l).mo2814volatile();
    }

    @Override // defpackage.InterfaceC9814l
    /* JADX INFO: renamed from: while */
    public int mo2815while() {
        return ((InterfaceC9814l) this.f33215l).mo2815while();
    }

    @Override // defpackage.InterfaceC9814l
    public void yandex() {
        ((InterfaceC9814l) this.f33215l).yandex();
    }

    /* JADX INFO: renamed from: lَٜؑ */
    public void mo2014l() {
    }

    /* JADX INFO: renamed from: lٕؖؔ */
    public void mo2015l() {
    }

    /* JADX INFO: renamed from: lؙؕؕ */
    public void mo2012l(C0560l c0560l) {
    }

    public /* synthetic */ AbstractC17054l(Object obj, Object obj2, boolean z, int i) {
        this.f33216l = i;
        this.f33215l = obj;
        this.f33214l = obj2;
    }

    public /* synthetic */ AbstractC17054l(Object obj, Object obj2, int i) {
        this.f33216l = i;
        this.f33214l = obj;
        this.f33215l = obj2;
    }

    public AbstractC17054l(C12125l c12125l) {
        this.f33216l = 6;
        this.f33215l = c12125l;
        C11534l c11534l = c12125l.loadAd;
        this.f33214l = c11534l;
        c11534l.yandex("Realm opened: " + this, new Object[0]);
    }

    public AbstractC17054l(Context context) {
        this.f33216l = 5;
        this.f33215l = context;
    }

    public AbstractC17054l(AbstractC5103l abstractC5103l) {
        this.f33216l = 3;
        this.f33215l = new C4983l(1, this);
        this.f33214l = new C11541l(this, abstractC5103l);
    }

    public AbstractC17054l(byte[] bArr) throws GeneralSecurityException {
        this.f33216l = 12;
        if (AbstractC12589l.pro(1)) {
            this.f33215l = mo2825l(1, bArr);
            this.f33214l = mo2825l(0, bArr);
        } else {
            C18262l.ads("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
    }

    public AbstractC17054l(InterfaceC9814l interfaceC9814l) {
        this.f33216l = 9;
        this.f33214l = new IdentityHashMap();
        this.f33215l = interfaceC9814l;
    }

    public AbstractC17054l(int i) {
        this.f33216l = i;
        switch (i) {
            case 1:
                this.f33214l = new int[2];
                break;
            case 10:
                this.f33215l = AbstractC1805l.loadAd(1);
                this.f33214l = new C9426l();
                break;
        }
    }

    public AbstractC17054l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l) {
        this.f33216l = 2;
        this.f33214l = layoutInflaterFactory2C14405l;
    }
}
