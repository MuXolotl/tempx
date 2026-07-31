package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘّۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5640l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f11994l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11995l;

    public C5640l(InterfaceC13238l interfaceC13238l, int i) {
        this.f11995l = i;
        switch (i) {
            case 2:
                int i2 = C15304l.f29913l;
                this.f11994l = interfaceC13238l;
                break;
            case 5:
                int i3 = C14653l.f28670l;
                this.f11994l = interfaceC13238l;
                break;
            case 10:
                int i4 = C5393l.f11563l;
                this.f11994l = interfaceC13238l;
                break;
            case 12:
                C8386l c8386l = C8386l.f17343l;
                this.f11994l = interfaceC13238l;
                break;
            case 14:
                C11130l c11130l = C11130l.f22344l;
                this.f11994l = interfaceC13238l;
                break;
            case 16:
                C11236l c11236l = C11236l.f22609l;
                this.f11994l = interfaceC13238l;
                break;
            case 22:
                C13327l c13327l = C13327l.f26157l;
                this.f11994l = interfaceC13238l;
                break;
            default:
                C15056l c15056l = C15056l.f29579l;
                this.f11994l = interfaceC13238l;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11995l;
        InterfaceC13238l interfaceC13238l = this.f11994l;
        switch (i) {
            case 0:
                return C15056l.f29579l.get(interfaceC13238l.get(((Number) obj).intValue()));
            case 1:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                int i2 = C15304l.f29913l;
                return ((CachedTrack) interfaceC13238l.get(iIntValue)).m4635implements();
            case 3:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 4:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                int i3 = C14653l.f28670l;
                return AbstractC16676l.mopub((AudioTrack) interfaceC13238l.get(iIntValue2));
            case 6:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 7:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 8:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 9:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                int i4 = C5393l.f11563l;
                return ((CachedTrack) interfaceC13238l.get(iIntValue3)).m4635implements();
            case 11:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 12:
                return C8386l.f17343l.get(interfaceC13238l.get(((Number) obj).intValue()));
            case 13:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 14:
                return C11130l.f22344l.get(interfaceC13238l.get(((Number) obj).intValue()));
            case 15:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 16:
                return C11236l.f22609l.get(interfaceC13238l.get(((Number) obj).intValue()));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C10893l) interfaceC13238l.get(((Number) obj).intValue())).yandex.m4635implements();
            case 20:
                ((C10893l) interfaceC13238l.get(((Number) obj).intValue())).getClass();
                return 1;
            case 21:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case 22:
                return C13327l.f26157l.get(interfaceC13238l.get(((Number) obj).intValue()));
            case 23:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
            default:
                interfaceC13238l.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ C5640l(InterfaceC13238l interfaceC13238l, int i, boolean z) {
        this.f11995l = i;
        this.f11994l = interfaceC13238l;
    }
}
