package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.webkit.WebView;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.playback.auto.VkxArtworkContentProvider;

/* JADX INFO: renamed from: lًٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15556l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f30388l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f30389l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30390l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15556l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30390l = i;
        this.f30388l = obj;
        this.f30389l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objAdmob;
        Object c18435l;
        Object c18435l2;
        Object objBilling;
        C2975l c2975l;
        C5574l c5574l;
        Object objFirebase;
        Object objAds;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        Object objFirebase2;
        Function1 function1;
        Object objM3168l;
        Object objM3168l2;
        int i = this.f30390l;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        int i2 = 10;
        int i3 = 3;
        int i4 = 2;
        Object obj2 = this.f30389l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i5 = 1;
        ?? r8 = 0;
        switch (i) {
            case 0:
                C18396l c18396l = (C18396l) this.f30388l;
                int i6 = this.f30391l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i6 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l = new C16534l(((CatalogArtist) c18396l.f35934l).loadAd, 5);
                this.f30391l = 1;
                if (c16534l.ads(this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l2 = AbstractC17278l.yandex;
                C4781l c4781l = new C4781l(c18396l, (C4456l) obj2, r8, i5);
                this.f30391l = 2;
                if (AbstractC10999l.firebase(c2975l2, c4781l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 1:
                int i7 = this.f30391l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AudioPlaylist audioPlaylist = ((C5218l) this.f30388l).f11302l;
                    C16534l c16534l2 = new C16534l(audioPlaylist.amazon, audioPlaylist.crashlytics);
                    this.f30391l = 1;
                    objAdmob = AbstractC8189l.admob(c16534l2, this);
                    if (objAdmob == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objAdmob = obj;
                }
                ((AppActivity) ((Context) obj2)).license(new C17398l((AudioPlaylist) objAdmob));
                return Unit.INSTANCE;
            case 2:
                C14451l c14451l = (C14451l) this.f30388l;
                C12552l c12552l = c14451l.f28630l;
                int i8 = this.f30391l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Object c13099l = c14451l.f28310l;
                    if (c13099l == null) {
                        c13099l = new C13099l(c12552l.billing);
                    }
                    AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4220for(((C8813l) obj2).crashlytics(), c12552l.billing);
                    C13305l c13305l = new C13305l(audioTrack != null ? new C11392l(AbstractC16676l.billing(audioTrack)) : C4618l.yandex, 0L, c12552l.billing, false, false, false, 122);
                    this.f30391l = 1;
                    Object objFirebase3 = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(c13305l, c13099l, (InterfaceC14029l) r8, i4), this);
                    if (objFirebase3 != enumC9342l) {
                        objFirebase3 = Unit.INSTANCE;
                    }
                    if (objFirebase3 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                C13470l c13470l = (C13470l) this.f30388l;
                int i9 = this.f30391l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30391l = 1;
                    if (C13470l.mopub(c13470l, (ArrayList) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c13470l.billing.clear();
                return Unit.INSTANCE;
            case 4:
                C13470l c13470l2 = (C13470l) obj2;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f30388l;
                int i10 = this.f30391l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30388l = interfaceC2262l;
                    this.f30391l = 1;
                    if (AbstractC8532l.purchase(1500L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                AbstractC10999l.mopub(c13470l2.crashlytics, null, 0, new C15556l(c13470l2, new ArrayList(c13470l2.billing), r8, i3), 3);
                return Unit.INSTANCE;
            case 5:
                int i11 = this.f30391l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30391l = 1;
                    if (((C14756l) this.f30388l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i11 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC7702l interfaceC7702l = (InterfaceC7702l) this.f30388l;
                int i12 = this.f30391l;
                try {
                    if (i12 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l = AbstractC6025l.yandex;
                        C14756l c14756l = (C14756l) obj2;
                        C6760l c6760l = C9658l.f19699l;
                        long jTapsense = AbstractC15918l.tapsense(30, enumC16636l);
                        C15556l c15556l = new C15556l(c14756l, interfaceC7702l, r8, 5);
                        this.f30388l = null;
                        this.f30391l = 1;
                        if (AbstractC15342l.mopub(jTapsense, c15556l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i12 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l = Unit.INSTANCE;
                    break;
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                Throwable thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    C15589l c15589l = C5013l.yandex;
                    C5013l.amazon(thYandex, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1725l.class.getName())));
                }
                return Unit.INSTANCE;
            case 7:
                int i13 = this.f30391l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30391l = 1;
                    if (((C14756l) this.f30388l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC7702l interfaceC7702l2 = (InterfaceC7702l) this.f30388l;
                int i14 = this.f30391l;
                try {
                    if (i14 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l2 = AbstractC6025l.yandex;
                        C14756l c14756l2 = (C14756l) obj2;
                        C6760l c6760l2 = C9658l.f19699l;
                        long jTapsense2 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15556l c15556l2 = new C15556l(c14756l2, interfaceC7702l2, r8, 7);
                        this.f30388l = null;
                        this.f30391l = 1;
                        if (AbstractC15342l.mopub(jTapsense2, c15556l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i14 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l2 = Unit.INSTANCE;
                    break;
                } catch (Throwable th2) {
                    c18435l2 = new C18435l(th2);
                }
                Throwable thYandex2 = C1171l.yandex(c18435l2);
                if (thYandex2 != null) {
                    C15589l c15589l2 = C5013l.yandex;
                    C5013l.amazon(thYandex2, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C14759l.class.getName())));
                }
                return Unit.INSTANCE;
            case 9:
                C17398l c17398l = (C17398l) this.f30388l;
                int i15 = this.f30391l;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objBilling = obj;
                    } else if (i15 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C16552l c16552l2 = AbstractC11463l.yandex;
                        c2975l = AbstractC17278l.yandex;
                        c5574l = new C5574l(c17398l, r8, i4);
                        this.f30391l = 3;
                        if (AbstractC10999l.firebase(c2975l, c5574l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i15 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                AudioPlaylist audioPlaylist2 = c17398l.f33899l;
                int i16 = audioPlaylist2.crashlytics;
                long j = audioPlaylist2.amazon;
                List listSingletonList = Collections.singletonList(AbstractC16676l.mopub((AudioTrack) obj2));
                this.f30391l = 1;
                C17464l c17464l = new C17464l("audio.removeFromPlaylist", C1461l.f3655l);
                c17464l.loadAd(i16, "playlist_id");
                c17464l.crashlytics(j, "owner_id");
                c17464l.yandex("audio_ids", AbstractC16901l.m4210case(AbstractC16901l.m4247try(listSingletonList, 100), ",", null, null, null, 62));
                objBilling = c7644lLoadAd.billing(c17464l, this);
                if (objBilling == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC10802l.isPro((AbstractC14237l) objBilling);
                this.f30391l = 2;
                if (AbstractC8532l.purchase(100L, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16552l c16552l3 = AbstractC11463l.yandex;
                c2975l = AbstractC17278l.yandex;
                c5574l = new C5574l(c17398l, r8, i4);
                this.f30391l = 3;
                if (AbstractC10999l.firebase(c2975l, c5574l, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 10:
                C13470l c13470l3 = (C13470l) this.f30388l;
                int i17 = this.f30391l;
                if (i17 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30391l = 1;
                    if (C13470l.admob(c13470l3, (ArrayList) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i17 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c13470l3.billing.clear();
                return Unit.INSTANCE;
            case 11:
                C13470l c13470l4 = (C13470l) obj2;
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f30388l;
                int i18 = this.f30391l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30388l = interfaceC2262l2;
                    this.f30391l = 1;
                    if (AbstractC8532l.purchase(1500L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i18 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                AbstractC10999l.mopub(c13470l4.crashlytics, null, 0, new C15556l(c13470l4, new ArrayList(c13470l4.billing), r8, i2), 3);
                return Unit.INSTANCE;
            case 12:
                Context context = (Context) obj2;
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f30388l;
                int i19 = this.f30391l;
                if (i19 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C18404l c18404l = C18404l.yandex;
                    this.f30388l = interfaceC2262l3;
                    this.f30391l = 1;
                    C16552l c16552l4 = AbstractC11463l.yandex;
                    objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0071l(i4, r8, 14), this);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i19 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objFirebase = obj;
                }
                C1203l c1203l = (C1203l) objFirebase;
                if (c1203l == null) {
                    return Unit.INSTANCE;
                }
                for (Map.Entry entry : c1203l.yandex.entrySet()) {
                    C18404l.amazon.put((String) entry.getKey(), (String) entry.getValue());
                }
                C12382l c12382l = AbstractC5921l.f12465l;
                C18404l c18404l2 = C18404l.yandex;
                String str = C14025l.f27330l;
                C7167l c7167l = new C7167l(c12382l.mo691continue(C6162l.ads(context.getFilesDir()).purchase("vkx_remote_config.json"), false));
                try {
                    C13047l c13047l = C18404l.loadAd;
                    c13047l.getClass();
                    AbstractC10802l.crashlytics(c13047l, new C5138l(17, c7167l), C1203l.Companion.serializer(), c1203l);
                    Unit unit = Unit.INSTANCE;
                    try {
                        c7167l.close();
                    } catch (Throwable th3) {
                        r8 = th3;
                    }
                    break;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    try {
                        c7167l.close();
                        r8 = th5;
                    } catch (Throwable th6) {
                        AbstractC11718l.yandex(th5, th6);
                        r8 = th5;
                    }
                    break;
                }
                if (r8 != 0) {
                    throw r8;
                }
                context.getSharedPreferences("VkxRemoteConfig", 0).edit().putLong("expiresAt", System.currentTimeMillis() + C18404l.crashlytics).apply();
                return Unit.INSTANCE;
            case 13:
                int i20 = this.f30391l;
                if (i20 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11485l c11485l = C11485l.f23075l;
                    String str2 = (String) this.f30388l;
                    this.f30391l = 1;
                    objAds = c11485l.ads(str2, this);
                    if (objAds == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i20 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objAds = obj;
                }
                CachedPlaylist cachedPlaylist = (CachedPlaylist) objAds;
                if (cachedPlaylist != null) {
                    C14025l c14025lCrashlytics = AbstractC5309l.crashlytics(cachedPlaylist);
                    C14025l c14025l = AbstractC5921l.f12465l.isVip(c14025lCrashlytics) ? c14025lCrashlytics : null;
                    if (c14025l != null && (parcelFileDescriptorOpen = ParcelFileDescriptor.open(c14025l.toFile(), 268435456)) != null) {
                        return parcelFileDescriptorOpen;
                    }
                }
                return VkxArtworkContentProvider.yandex();
            case 14:
                int i21 = this.f30391l;
                if (i21 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30391l = 1;
                    Object objLoadAd = ((C16076l) ((C15035l) this.f30388l).loadAd.get()).f31518l.loadAd((C2427l) obj2, this);
                    return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
                }
                if (i21 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                C9135l c9135l = (C9135l) obj2;
                C16511l c16511l = c9135l.f18785l;
                InterfaceC2262l interfaceC2262l4 = (InterfaceC2262l) this.f30388l;
                int i22 = this.f30391l;
                try {
                    if (i22 != 0) {
                        if (i22 == 1) {
                            AbstractC2829l.crashlytics(obj);
                            objFirebase2 = obj;
                        } else {
                            if (i22 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    c9135l.tapsense(true);
                    c9135l.isVip(EnumC18546l.f36206l);
                    InterfaceC2779l interfaceC2779l = c16511l.purchase;
                    if (interfaceC2779l instanceof C1480l) {
                        String str3 = ((C1480l) interfaceC2779l).yandex;
                        C4568l c4568l = new C4568l(15, c9135l);
                        this.f30388l = interfaceC2262l4;
                        this.f30391l = 1;
                        C16552l c16552l5 = AbstractC11463l.yandex;
                        objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8568l(c4568l, str3, r8, 6), this);
                        if (objFirebase2 == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (!(interfaceC2779l instanceof C3829l)) {
                            throw new C6451l(11);
                        }
                        C9135l.ad(c9135l);
                    }
                    if (AbstractC1804l.yandex()) {
                        this.f30388l = null;
                        this.f30391l = 2;
                        if (C9135l.pro(c9135l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        c9135l.tapsense(c16511l.mopub);
                        c9135l.isVip(EnumC18546l.f36205l);
                    }
                    return Unit.INSTANCE;
                    if (AbstractC1804l.yandex()) {
                        c9135l.tapsense(c16511l.mopub);
                        c9135l.isVip(EnumC18546l.f36205l);
                    } else {
                        this.f30388l = null;
                        this.f30391l = 2;
                        if (C9135l.pro(c9135l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (AbstractC11990l.smaato(interfaceC2262l4)) {
                        c9135l.tapsense(c16511l.mopub);
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        c9135l.f18782l.setValue(new C8311l(39, i4, message));
                        c9135l.isVip(EnumC18546l.f36208l);
                    }
                    return Unit.INSTANCE;
                }
            case 16:
                int i23 = this.f30391l;
                if (i23 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    function1 = (Function1) obj2;
                    C11644l c11644l = C6336l.loadAd;
                    this.f30388l = function1;
                    this.f30391l = 1;
                    objM3168l = c11644l.m3168l(this);
                    if (objM3168l == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i23 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function2 = (Function1) this.f30388l;
                    AbstractC2829l.crashlytics(obj);
                    function1 = function2;
                    objM3168l = obj;
                }
                return function1.invoke(objM3168l);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AudioTrack audioTrack2 = (AudioTrack) obj2;
                int i24 = this.f30391l;
                if (i24 != 0) {
                    if (i24 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objM3168l2 = obj;
                    } else if (i24 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l3 = AbstractC6025l.yandex;
                        this.f30388l = null;
                        this.f30391l = 3;
                        if (AbstractC6025l.yandex(C4097l.yandex, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i24 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                if (!C6168l.pro(audioTrack2)) {
                    return Unit.INSTANCE;
                }
                AbstractC5921l.f12465l.ads(AbstractC0825l.subs(2, AbstractC16676l.mopub(audioTrack2)));
                C6336l c6336l = C6336l.yandex;
                this.f30388l = null;
                this.f30391l = 1;
                objM3168l2 = C6336l.loadAd.m3168l(this);
                if (objM3168l2 == enumC9342l) {
                    return enumC9342l;
                }
                C0783l c0783l = new C0783l(28, audioTrack2);
                this.f30388l = null;
                this.f30391l = 2;
                if (((C5198l) objM3168l2).m1734l(c0783l, this) == enumC9342l) {
                    return enumC9342l;
                }
                C8490l c8490l4 = AbstractC6025l.yandex;
                this.f30388l = null;
                this.f30391l = 3;
                if (AbstractC6025l.yandex(C4097l.yandex, this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i25 = this.f30391l;
                if (i25 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C14970l c14970lMetrica = AbstractC8020l.metrica(new C13932l(13, (C6576l) this.f30388l));
                    C2354l c2354l = new C2354l(21, (WebView) obj2);
                    this.f30391l = 1;
                    if (c14970lMetrica.yandex(c2354l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i25 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C4791l c4791l = (C4791l) this.f30388l;
                View view = (View) obj2;
                int i26 = this.f30391l;
                try {
                    if (i26 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        this.f30391l = 1;
                        Object objSmaato = AbstractC0622l.smaato(c4791l.license, new C2051l(i4, r8, i2), this);
                        if (objSmaato != enumC9342l) {
                            objSmaato = Unit.INSTANCE;
                        }
                        if (objSmaato == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i26 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    if (AbstractC7980l.yandex(view) == c4791l) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th7) {
                    if (AbstractC7980l.yandex(view) == c4791l) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    throw th7;
                }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f30390l;
        Object obj2 = this.f30389l;
        switch (i) {
            case 0:
                return new C15556l((C18396l) this.f30388l, (C4456l) obj2, interfaceC14029l, 0);
            case 1:
                return new C15556l((C5218l) this.f30388l, (Context) obj2, interfaceC14029l, 1);
            case 2:
                return new C15556l((C14451l) this.f30388l, (C8813l) obj2, interfaceC14029l, 2);
            case 3:
                return new C15556l((C13470l) this.f30388l, (ArrayList) obj2, interfaceC14029l, 3);
            case 4:
                C15556l c15556l = new C15556l((C13470l) obj2, interfaceC14029l, 4);
                c15556l.f30388l = obj;
                return c15556l;
            case 5:
                return new C15556l((C14756l) this.f30388l, (InterfaceC7702l) obj2, interfaceC14029l, 5);
            case 6:
                C15556l c15556l2 = new C15556l((C14756l) obj2, interfaceC14029l, 6);
                c15556l2.f30388l = obj;
                return c15556l2;
            case 7:
                return new C15556l((C14756l) this.f30388l, (InterfaceC7702l) obj2, interfaceC14029l, 7);
            case 8:
                C15556l c15556l3 = new C15556l((C14756l) obj2, interfaceC14029l, 8);
                c15556l3.f30388l = obj;
                return c15556l3;
            case 9:
                return new C15556l((C17398l) this.f30388l, (AudioTrack) obj2, interfaceC14029l, 9);
            case 10:
                return new C15556l((C13470l) this.f30388l, (ArrayList) obj2, interfaceC14029l, 10);
            case 11:
                C15556l c15556l4 = new C15556l((C13470l) obj2, interfaceC14029l, 11);
                c15556l4.f30388l = obj;
                return c15556l4;
            case 12:
                C15556l c15556l5 = new C15556l((Context) obj2, interfaceC14029l, 12);
                c15556l5.f30388l = obj;
                return c15556l5;
            case 13:
                return new C15556l((String) this.f30388l, (VkxArtworkContentProvider) obj2, interfaceC14029l, 13);
            case 14:
                return new C15556l((C15035l) this.f30388l, (C2427l) obj2, interfaceC14029l, 14);
            case 15:
                C15556l c15556l6 = new C15556l((C9135l) obj2, interfaceC14029l, 15);
                c15556l6.f30388l = obj;
                return c15556l6;
            case 16:
                return new C15556l((Function1) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15556l c15556l7 = new C15556l((AudioTrack) obj2, interfaceC14029l, 17);
                c15556l7.f30388l = obj;
                return c15556l7;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C15556l((C6576l) this.f30388l, (WebView) obj2, interfaceC14029l, 18);
            default:
                return new C15556l((C4791l) this.f30388l, (View) obj2, interfaceC14029l, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30390l) {
            case 0:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C15556l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15556l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30390l = i;
        this.f30389l = obj;
    }
}
