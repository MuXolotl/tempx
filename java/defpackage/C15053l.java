package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.crypto.KeyAgreement;

/* JADX INFO: renamed from: lٔٞ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C15053l implements InterfaceC9560l, InterfaceC18084l, InterfaceC15479l, InterfaceC14606l, InterfaceC8475l, InterfaceC14209l, InterfaceC17433l, InterfaceC13221l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C15053l f29573l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f29576l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11361l f29572l = new C11361l(0, false, false, 0, 0);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final byte[] f29575l = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final byte[] f29574l = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    public C15053l(int i) {
        switch (i) {
            case 14:
                this.f29576l = new HashSet();
                break;
            default:
                this.f29576l = new C18595l(9);
                break;
        }
    }

    public static C15053l subscription(String str) {
        return new C15053l((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC17672l.UNINITIALIZED : C10559l.purchase(str.charAt(0)));
    }

    public static synchronized C15053l vip() {
        try {
            if (f29573l == null) {
                f29573l = new C15053l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f29573l;
    }

    public void adcel(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", AbstractC16431l.amazon(list, MediaBrowserCompat$MediaItem.CREATOR));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle3);
        ((Messenger) this.f29576l).send(messageObtain);
    }

    public void ads(AbstractC11653l abstractC11653l, C13187l c13187l, Collection collection) {
        C17646l c17646l = (C17646l) this.f29576l;
        if (abstractC11653l != c17646l.advert || c13187l == null) {
            if (abstractC11653l == c17646l.purchase) {
                if (c13187l != null) {
                    c17646l.metrica(c17646l.amazon, c13187l);
                }
                C12736l c12736l = c17646l.amazon;
                c12736l.getClass();
                C12037l c12037l = c12736l instanceof C12037l ? (C12037l) c12736l : null;
                if (c12037l != null) {
                    c12037l.subs(collection);
                    return;
                }
                return;
            }
            return;
        }
        C12545l c12545l = c17646l.ad.yandex;
        String strAmazon = c13187l.amazon();
        C12037l c12037l2 = new C12037l(c12545l, strAmazon, c17646l.loadAd(c12545l, strAmazon));
        c12037l2.billing(c13187l);
        if (c17646l.amazon == c12037l2) {
            return;
        }
        AbstractC11653l abstractC11653l2 = c17646l.advert;
        C12736l c12736l2 = c17646l.ad;
        C15014l c15014l = c17646l.billing;
        if (c15014l != null) {
            c15014l.yandex();
            c17646l.billing = null;
        }
        C15014l c15014l2 = new C15014l(c17646l, c12037l2, abstractC11653l2, 3, true, c12736l2, collection);
        c17646l.billing = c15014l2;
        c15014l2.loadAd();
        c17646l.ad = null;
        c17646l.advert = null;
    }

    @Override // defpackage.InterfaceC14606l
    public /* bridge */ /* synthetic */ void amazon(Object obj) {
    }

    @Override // defpackage.InterfaceC17433l
    public void billing(MenuC4984l menuC4984l) {
        Toolbar toolbar = (Toolbar) this.f29576l;
        C0791l c0791l = toolbar.f247l.f157l;
        if (c0791l == null || !c0791l.isPro()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f262l.f20586l).iterator();
            while (it.hasNext()) {
                ((C17591l) it.next()).yandex.tapsense();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC8475l
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f29576l;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                AbstractC14238l.vip((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // defpackage.InterfaceC15479l
    public void crashlytics(C10602l c10602l) {
        boolean z = c10602l.f21520l == 0;
        AbstractC4620l abstractC4620l = (AbstractC4620l) this.f29576l;
        if (z) {
            abstractC4620l.remoteconfig(null, abstractC4620l.vip());
            return;
        }
        InterfaceC14795l interfaceC14795l = abstractC4620l.adcel;
        if (interfaceC14795l != null) {
            interfaceC14795l.crashlytics(c10602l);
        }
    }

    public C16710l firebase() {
        if (((ArrayList) this.f29576l) == null) {
            return C16710l.crashlytics;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.f29576l);
        return new C16710l(bundle, (ArrayList) this.f29576l);
    }

    @Override // defpackage.InterfaceC13221l
    public InterfaceC6269l get(int i) {
        return ((C9081l[]) this.f29576l)[i];
    }

    public void isPro(StringBuilder sb, Iterator it) {
        C1693l c1693l = (C1693l) this.f29576l;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(C1693l.mopub(entry.getKey()));
            sb.append("=");
            sb.append(C1693l.mopub(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) c1693l.f4077l);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(C1693l.mopub(entry2.getKey()));
                sb.append("=");
                sb.append(C1693l.mopub(entry2.getValue()));
            }
        }
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo1665l(C3498l c3498l, Object obj) {
        C14537l c14537l = (C14537l) this.f29576l;
        String strLoadAd = c3498l.loadAd();
        if ("version".equals(strLoadAd)) {
            if (obj instanceof int[]) {
                c14537l.f28472l = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strLoadAd)) {
            c14537l.f28471l = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        String strLoadAd = c3498l.loadAd();
        if ("data".equals(strLoadAd) || "filePartClassNames".equals(strLoadAd)) {
            return new C12480l(this, 0);
        }
        if ("strings".equals(strLoadAd)) {
            return new C12480l(this, 1);
        }
        return null;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        return null;
    }

    public Iterator metrica(C8662l c8662l, CharSequence charSequence) {
        return new C17391l(this, c8662l, charSequence);
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        C7025l c7025l = (C7025l) ((C7026l) this.f29576l).f14720l;
        if (!z) {
            c7025l.yandex(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            c7025l.yandex(1, codecException.getMessage(), codecException);
        }
    }

    @Override // defpackage.InterfaceC9560l
    public C1561l purchase() throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", (Provider) this.f29576l);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            C18262l.ads("Invalid encoded private key length");
            return null;
        }
        if (!AbstractC0647l.yandex(f29575l, encoded)) {
            C18262l.ads("Invalid encoded private key prefix");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            C18262l.ads("Invalid encoded public key length");
            return null;
        }
        if (AbstractC0647l.yandex(f29574l, encoded2)) {
            return new C1561l(bArrCopyOfRange, Arrays.copyOfRange(encoded2, 12, encoded2.length));
        }
        C18262l.ads("Invalid encoded public key prefix");
        return null;
    }

    public C15053l remoteconfig(String str) {
        C5222l c5222lPurchase;
        Class clsSubs = AbstractC16131l.subs((ClassLoader) this.f29576l, str);
        if (clsSubs == null || (c5222lPurchase = AbstractC0019l.purchase(clsSubs)) == null) {
            return null;
        }
        return new C15053l(c5222lPurchase);
    }

    @Override // defpackage.InterfaceC8475l
    public Cursor smaato(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f29576l;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC9560l
    public byte[] startapp(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = (Provider) this.f29576l;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            C18073l.smaato("Invalid X25519 private key");
            return null;
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(AbstractC17265l.amazon(f29575l, bArr)));
        if (bArr2.length != 32) {
            C18073l.smaato("Invalid X25519 public key");
            return null;
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(AbstractC17265l.amazon(f29574l, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    @Override // defpackage.InterfaceC17433l
    public boolean yandex(MenuC4984l menuC4984l, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract */
    public void mo1662abstract() {
    }

    public C15053l(AbstractC4620l abstractC4620l) {
        Objects.requireNonNull(abstractC4620l);
        this.f29576l = abstractC4620l;
    }

    public /* synthetic */ C15053l(Object obj) {
        this.f29576l = obj;
    }

    @Override // defpackage.InterfaceC18084l
    public void admob(int i) {
    }

    @Override // defpackage.InterfaceC18084l
    public void loadAd(int i) {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
    }

    public void subs(int i, float f) {
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
    }
}
