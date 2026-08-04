package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0228l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ int f1198l = 0;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10086l f1199l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f1200l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f1201l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f1202l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f1203l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final AudioPlaylist f1204l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C12376l f1205l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f1206l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f1207l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f1208l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public File f1209l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Function1 f1210l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f1211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228l(Function1 function1, AudioPlaylist audioPlaylist, List list, int i) {
        super(false, 3);
        audioPlaylist = (i & 2) != 0 ? null : audioPlaylist;
        list = (i & 4) != 0 ? C2580l.f5619l : list;
        this.f1210l = function1;
        this.f1204l = audioPlaylist;
        Boolean bool = Boolean.FALSE;
        this.f1202l = AbstractC8020l.smaato(bool);
        this.f1201l = AbstractC8020l.smaato(bool);
        this.f1200l = AbstractC8020l.smaato(bool);
        String str = audioPlaylist != null ? audioPlaylist.mopub : null;
        this.f1211l = AbstractC8020l.smaato(str == null ? "" : str);
        String str2 = audioPlaylist != null ? audioPlaylist.admob : null;
        this.f1203l = AbstractC8020l.smaato(str2 != null ? str2 : "");
        this.f1206l = AbstractC8020l.smaato(Boolean.valueOf(audioPlaylist != null ? audioPlaylist.premium : false));
        this.f1208l = AbstractC8020l.smaato(null);
        this.f1199l = AbstractC8020l.smaato(AbstractC0509l.billing(list));
        C12376l c12376l = new C12376l();
        for (AudioTrack audioTrack : list) {
            audioTrack.getClass();
            c12376l.put(AbstractC16676l.mopub(audioTrack), this.f1204l != null ? EnumC11199l.f22552l : EnumC11199l.f22551l);
        }
        this.f1205l = c12376l;
    }

    public static Unit ad(C0228l c0228l, Uri uri) throws IOException {
        if (uri != null) {
            int i = Build.VERSION.SDK_INT;
            Activity activity = c0228l.f5081l;
            Bitmap bitmapDecodeBitmap = i >= 28 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(activity.getContentResolver(), uri), new C11684l()) : MediaStore.Images.Media.getBitmap(activity.getContentResolver(), uri);
            float width = bitmapDecodeBitmap.getWidth();
            float height = bitmapDecodeBitmap.getHeight();
            float fMax = Math.max(600.0f / width, 600.0f / height);
            float f = width * fMax;
            float f2 = fMax * height;
            float f3 = (600.0f - f) / 2.0f;
            float f4 = (600.0f - f2) / 2.0f;
            RectF rectF = new RectF(f3, f4, f + f3, f2 + f4);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(600, 600, bitmapDecodeBitmap.getConfig());
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeBitmap, (Rect) null, rectF, (Paint) null);
            C13270l.f26055l.getClass();
            VKXApplication vKXApplication = VKXApplication.f36631l;
            File file = new File((vKXApplication != null ? vKXApplication : null).getDir("artworkCache", 0), "VKXPlaylistCoverCache.png");
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            c0228l.f1209l = file;
            c0228l.f1208l.setValue(new C14115l(bitmapCreateBitmap));
            c0228l.f1207l = false;
        }
        c0228l.advert();
        return Unit.INSTANCE;
    }

    public static void pro(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:33:0x0060->B:44:?, LOOP_END, SYNTHETIC] */
    public final void advert() {
        boolean z;
        C12376l c12376l;
        C17704l c17704l;
        Object it;
        if (this.f1209l != null || this.f1207l) {
            z = true;
        } else {
            int length = applovin().length();
            AudioPlaylist audioPlaylist = this.f1204l;
            if (length > 0) {
                if (!AbstractC8576l.yandex(applovin(), audioPlaylist != null ? audioPlaylist.mopub : null)) {
                    z = true;
                } else if (signatures().length() > 0) {
                    if (AbstractC8576l.yandex(signatures(), audioPlaylist != null ? audioPlaylist.mopub : null)) {
                        z = true;
                    } else if (audioPlaylist != null || premium() == audioPlaylist.premium) {
                        if (audioPlaylist != null) {
                            c12376l = this.f1205l;
                            if (!c12376l.isEmpty() && ((c17704l = c12376l.f24468l) == null || !c17704l.isEmpty())) {
                                it = c17704l.iterator();
                                while (true) {
                                    if (((AbstractC0576l) it).hasNext()) {
                                        if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (audioPlaylist != null) {
                    if (audioPlaylist != null) {
                        c12376l = this.f1205l;
                        if (!c12376l.isEmpty()) {
                            it = c17704l.iterator();
                            while (true) {
                                if (((AbstractC0576l) it).hasNext()) {
                                    if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    if (audioPlaylist != null) {
                        c12376l = this.f1205l;
                        if (!c12376l.isEmpty()) {
                            it = c17704l.iterator();
                            while (true) {
                                if (((AbstractC0576l) it).hasNext()) {
                                    if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
            } else if (signatures().length() > 0) {
                if (AbstractC8576l.yandex(signatures(), audioPlaylist != null ? audioPlaylist.mopub : null)) {
                    z = true;
                } else if (audioPlaylist != null) {
                    if (audioPlaylist != null) {
                        c12376l = this.f1205l;
                        if (!c12376l.isEmpty()) {
                            it = c17704l.iterator();
                            while (true) {
                                if (((AbstractC0576l) it).hasNext()) {
                                    if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    if (audioPlaylist != null) {
                        c12376l = this.f1205l;
                        if (!c12376l.isEmpty()) {
                            it = c17704l.iterator();
                            while (true) {
                                if (((AbstractC0576l) it).hasNext()) {
                                    if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
            } else if (audioPlaylist != null) {
                if (audioPlaylist != null) {
                    c12376l = this.f1205l;
                    if (!c12376l.isEmpty()) {
                        it = c17704l.iterator();
                        while (true) {
                            if (((AbstractC0576l) it).hasNext()) {
                                if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                z = false;
            } else {
                if (audioPlaylist != null) {
                    c12376l = this.f1205l;
                    if (!c12376l.isEmpty()) {
                        it = c17704l.iterator();
                        while (true) {
                            if (((AbstractC0576l) it).hasNext()) {
                                if (((EnumC11199l) ((C13293l) it).next()) != EnumC11199l.f22552l) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                z = false;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C10086l c10086l = this.f1202l;
        c10086l.setValue(boolValueOf);
        tapsense(((Boolean) c10086l.getValue()).booleanValue());
    }

    public final String applovin() {
        return (String) this.f1211l.getValue();
    }

    public final InterfaceC13238l isVip() {
        return (InterfaceC13238l) this.f1199l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        C5866l c5866l;
        ?? r0;
        C6956l c6956l2;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(-1473785390);
        int i2 = 2;
        int i3 = i | (c6956l3.admob(this) ? 4 : 2);
        byte b = 0;
        int i4 = 1;
        if (c6956l3.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l3);
            InterfaceC1234l interfaceC1234l = (InterfaceC1234l) c6956l3.isPro(AbstractC4751l.smaato);
            C17423l c17423l = new C17423l(1);
            boolean zAdmob = c6956l3.admob(this);
            Object objM2132native = c6956l3.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C8946l(this, i4);
                c6956l3.m2147try(objM2132native);
            }
            C16307l c16307lAmazon = AbstractC7902l.amazon(c17423l, (Function1) objM2132native, c6956l3);
            boolean zAdmob2 = c6956l3.admob(this);
            Object objM2132native2 = c6956l3.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C5752l(this, (InterfaceC14029l) null);
                c6956l3.m2147try(objM2132native2);
            }
            C5056l c5056lMetrica = AbstractC12953l.metrica(c5866lYandex, (Function4) objM2132native2, c6956l3);
            if (((Boolean) this.f1201l.getValue()).booleanValue()) {
                c6956l3.m2123default(1912042092);
                boolean zAdmob3 = c6956l3.admob(this);
                Object objM2132native3 = c6956l3.m2132native();
                if (zAdmob3 || objM2132native3 == c13863l) {
                    objM2132native3 = new C6303l(this, i2);
                    c6956l3.m2147try(objM2132native3);
                }
                c5866l = c5866lYandex;
                r0 = 0;
                AbstractC16291l.yandex((Function0) objM2132native3, AbstractC14566l.amazon(747019871, new C15956l(this, b, b), c6956l3), null, AbstractC14566l.amazon(-2144078239, new C15956l(this, i4, b), c6956l3), null, AbstractC11184l.crashlytics, AbstractC11184l.amazon, null, 0L, 0L, 0L, 0L, null, c6956l, 1772592, 0, 16276);
                c6956l2 = c6956l;
            } else {
                c5866l = c5866lYandex;
                r0 = 0;
                c6956l3.m2123default(1902058480);
                c6956l2 = c6956l3;
            }
            c6956l2.startapp(r0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-2025449842, new C15956l(this, i2, r0), c6956l2), AbstractC14566l.amazon(2137193709, new C15956l(this, 3, r0), c6956l2), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(599965667, new C18383l(c5866l, this, c16307lAmazon, c5056lMetrica, interfaceC1234l, 2), c6956l2), c6956l2, 905970096, 249);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15956l(this, i);
        }
    }

    public final boolean premium() {
        return ((Boolean) this.f1206l.getValue()).booleanValue();
    }

    public final String signatures() {
        return (String) this.f1203l.getValue();
    }

    @Override // defpackage.AbstractC2338l
    public final void subs() {
        if (((Boolean) this.f1202l.getValue()).booleanValue()) {
            this.f1201l.setValue(Boolean.TRUE);
        } else {
            super.subs();
        }
    }
}
