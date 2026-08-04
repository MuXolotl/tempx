package ua.itaysonlab.vkxreborn.playback.auto;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import defpackage.AbstractC0825l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11356l;
import defpackage.AbstractC11718l;
import defpackage.AbstractC1214l;
import defpackage.AbstractC15042l;
import defpackage.AbstractC16676l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC2632l;
import defpackage.AbstractC2952l;
import defpackage.AbstractC5309l;
import defpackage.AbstractC5921l;
import defpackage.AbstractC7709l;
import defpackage.AbstractC9050l;
import defpackage.C10507l;
import defpackage.C10946l;
import defpackage.C11352l;
import defpackage.C11489l;
import defpackage.C12014l;
import defpackage.C12382l;
import defpackage.C12889l;
import defpackage.C13767l;
import defpackage.C14025l;
import defpackage.C1503l;
import defpackage.C15156l;
import defpackage.C15556l;
import defpackage.C16076l;
import defpackage.C16543l;
import defpackage.C16820l;
import defpackage.C17218l;
import defpackage.C18435l;
import defpackage.C2941l;
import defpackage.C5198l;
import defpackage.C5613l;
import defpackage.C6109l;
import defpackage.C6162l;
import defpackage.C6165l;
import defpackage.C6168l;
import defpackage.C6336l;
import defpackage.C7167l;
import defpackage.C9477l;
import defpackage.InterfaceC11509l;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class VkxArtworkContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f36827l = 0;

    public static ParcelFileDescriptor amazon(AudioTrack audioTrack) {
        C14025l c14025lAmazon;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        String strMopub = AbstractC16676l.mopub(audioTrack);
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{strMopub}, 1))) : null;
        if (cachedTrack != null && (c14025lAmazon = AbstractC5309l.amazon(cachedTrack)) != null) {
            C14025l c14025l = AbstractC5921l.f12465l.isVip(c14025lAmazon) ? c14025lAmazon : null;
            if (c14025l != null && (parcelFileDescriptorOpen = ParcelFileDescriptor.open(c14025l.toFile(), 268435456)) != null) {
                return parcelFileDescriptorOpen;
            }
        }
        return yandex();
    }

    public static ParcelFileDescriptor yandex() throws Throwable {
        Throwable th;
        Long lValueOf;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        Throwable th2 = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        String str = C14025l.f27330l;
        C14025l c14025lPurchase = C6162l.ads(vKXApplication.getFilesDir()).purchase("unpacked_assets").purchase("vkx_default_artwork.webp");
        C12382l c12382l = AbstractC5921l.f12465l;
        if (!c12382l.isVip(c14025lPurchase)) {
            C14025l c14025lCrashlytics = c14025lPurchase.crashlytics();
            if (c14025lCrashlytics != null) {
                c12382l.mopub(c14025lCrashlytics);
            }
            C7167l c7167l = new C7167l(c12382l.mo691continue(c14025lPurchase, false));
            try {
                C1503l c1503l = new C1503l(AbstractC7709l.purchase(vKXApplication.getAssets().open("vkx_default_artwork.webp")));
                try {
                    lValueOf = Long.valueOf(c7167l.mo736volatile(c1503l));
                    try {
                        c1503l.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c1503l.close();
                    } catch (Throwable th5) {
                        AbstractC11718l.yandex(th4, th5);
                    }
                    th = th4;
                    lValueOf = null;
                }
                if (th != null) {
                    throw th;
                }
                lValueOf.getClass();
                try {
                    c7167l.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
                if (th2 != null) {
                    throw th2;
                }
            } catch (Throwable th7) {
                th2 = th7;
                try {
                    c7167l.close();
                } catch (Throwable th8) {
                    AbstractC11718l.yandex(th2, th8);
                }
            }
        }
        return ParcelFileDescriptor.open(c14025lPurchase.toFile(), 268435456);
    }

    public final ParcelFileDescriptor crashlytics(AbstractC18643l abstractC18643l) {
        try {
            Context context = getContext();
            if (context == null) {
                return null;
            }
            C9477l c9477l = new C9477l(context);
            c9477l.crashlytics = abstractC18643l;
            c9477l.crashlytics(600);
            c9477l.smaato = 4;
            C13767l c13767lLoadAd = c9477l.loadAd();
            C16543l c16543l = C12014l.f23937l;
            Boolean bool = Boolean.TRUE;
            c13767lLoadAd.yandex(c16543l, bool);
            c9477l.loadAd().yandex(C12014l.f23938l, bool);
            c9477l.admob = new C15156l();
            InterfaceC11509l interfaceC11509l = (InterfaceC11509l) AbstractC10999l.subs(C17218l.f33421l, new C2941l(AbstractC2952l.yandex(context), c9477l.yandex(), null, 0));
            C6165l c6165l = interfaceC11509l instanceof C6165l ? (C6165l) interfaceC11509l : null;
            if (c6165l == null) {
                return yandex();
            }
            C6109l c6109l = (C6109l) AbstractC2952l.yandex(context).yandex.purchase.getValue();
            if (c6109l != null) {
                String str = c6165l.purchase;
                if (str == null) {
                    str = "";
                }
                C5613l c5613l = c6109l.loadAd;
                byte[] bytes = str.getBytes(AbstractC9050l.yandex);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = new char[bArrDigest.length * 2];
                int i = 0;
                for (byte b : bArrDigest) {
                    int i2 = i + 1;
                    char[] cArr2 = AbstractC2632l.loadAd;
                    cArr[i] = cArr2[(b >> 4) & 15];
                    i += 2;
                    cArr[i2] = cArr2[b & 15];
                }
                C10946l c10946lMopub = c5613l.mopub(new String(cArr));
                C11352l c11352l = c10946lMopub != null ? new C11352l(c10946lMopub) : null;
                if (c11352l != null) {
                    try {
                        C10946l c10946l = c11352l.f22897l;
                        if (c10946l.f22075l) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(((C14025l) c10946l.f22076l.crashlytics.get(1)).toFile(), 268435456);
                        AbstractC1214l.yandex(c11352l, null);
                        if (parcelFileDescriptorOpen != null) {
                            return parcelFileDescriptorOpen;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1214l.yandex(c11352l, th);
                            throw th2;
                        }
                    }
                }
            }
            return yandex();
        } catch (Exception e) {
            e.printStackTrace();
            return yandex();
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final ParcelFileDescriptor loadAd(C16820l c16820l) {
        Object c18435l;
        ContentResolver contentResolver;
        InputStream inputStreamOpenInputStream;
        try {
            Context context = getContext();
            if (context == null || (contentResolver = context.getContentResolver()) == null || (inputStreamOpenInputStream = contentResolver.openInputStream(Uri.parse(c16820l.getAmazon()))) == null) {
                c18435l = yandex();
            } else {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                new C12889l(inputStreamOpenInputStream, new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1])).start();
                c18435l = parcelFileDescriptorArrCreatePipe[0];
            }
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        boolean z = c18435l instanceof C18435l;
        Object obj = c18435l;
        if (z) {
            obj = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        return parcelFileDescriptor == null ? yandex() : parcelFileDescriptor;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        String str2 = (String) AbstractC16901l.m4220for(0, uri.getPathSegments());
        if (str2 == null) {
            return yandex();
        }
        String str3 = (String) AbstractC16901l.m4220for(1, uri.getPathSegments());
        if (str3 == null) {
            return yandex();
        }
        int iHashCode = str2.hashCode();
        C14025l c14025l = 0;
        if (iHashCode != -1930136334) {
            if (iHashCode != -1687000017) {
                if (iHashCode == 110621003 && str2.equals("track")) {
                    C16076l c16076l = VKXApplication.f36632l;
                    if (c16076l == null) {
                        c16076l = null;
                    }
                    C10507l c10507lSubs = c16076l.f31521l.subs(str3);
                    AbstractC18643l abstractC18643l = c10507lSubs != null ? c10507lSubs.loadAd : null;
                    if (abstractC18643l instanceof C16820l) {
                        if (!C11489l.yandex.yandex()) {
                            return loadAd((C16820l) abstractC18643l);
                        }
                        ParcelFileDescriptor parcelFileDescriptorCrashlytics = crashlytics(abstractC18643l);
                        return parcelFileDescriptorCrashlytics == null ? loadAd((C16820l) abstractC18643l) : parcelFileDescriptorCrashlytics;
                    }
                    if (abstractC18643l instanceof AudioTrack) {
                        AudioTrack audioTrack = (AudioTrack) abstractC18643l;
                        if (C6168l.pro(audioTrack)) {
                            if (!C11489l.yandex.yandex() || AbstractC15042l.ads(abstractC18643l)) {
                                return amazon(audioTrack);
                            }
                            ParcelFileDescriptor parcelFileDescriptorCrashlytics2 = crashlytics(abstractC18643l);
                            return parcelFileDescriptorCrashlytics2 == null ? amazon(audioTrack) : parcelFileDescriptorCrashlytics2;
                        }
                    }
                    if (abstractC18643l == null) {
                        return yandex();
                    }
                    ParcelFileDescriptor parcelFileDescriptorCrashlytics3 = crashlytics(abstractC18643l);
                    return parcelFileDescriptorCrashlytics3 == null ? yandex() : parcelFileDescriptorCrashlytics3;
                }
            } else if (str2.equals("playlist_cached")) {
                return (ParcelFileDescriptor) AbstractC10999l.subs(C17218l.f33421l, new C15556l(str3, this, c14025l, 13));
            }
        } else if (str2.equals("album_cached")) {
            C14025l c14025lAdmob = AbstractC0825l.admob(4, str3);
            c14025l = AbstractC5921l.f12465l.isVip(c14025lAdmob) ? c14025lAdmob : 0;
            return (c14025l == 0 || (parcelFileDescriptorOpen = ParcelFileDescriptor.open(c14025l.toFile(), 268435456)) == null) ? yandex() : parcelFileDescriptorOpen;
        }
        return yandex();
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, null);
    }
}
