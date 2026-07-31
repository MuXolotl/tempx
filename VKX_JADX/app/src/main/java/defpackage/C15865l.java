package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15865l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5636l f31132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f31133l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ List f31134l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ View f31135l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f31136l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f31137l;

    public C15865l(List list, C5056l c5056l, C5636l c5636l, InterfaceC2262l interfaceC2262l, View view, InterfaceC12244l interfaceC12244l) {
        this.f31134l = list;
        this.f31133l = c5056l;
        this.f31132l = c5636l;
        this.f31136l = interfaceC2262l;
        this.f31135l = view;
        this.f31137l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C8195l c8195l;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            C18233l c18233l = (C18233l) this.f31134l.get(iIntValue);
            c6956l.m2123default(-531858454);
            int iOrdinal = c18233l.f35744l.ordinal();
            if (iOrdinal == 0) {
                c8195l = new C8195l(Integer.valueOf(R.string.settings_integrations_lyrics_provider_vk), Integer.valueOf(R.string.settings_integrations_lyrics_provider_vk_description));
            } else if (iOrdinal == 1) {
                c8195l = new C8195l(Integer.valueOf(R.string.settings_integrations_lyrics_provider_genius), Integer.valueOf(R.string.settings_integrations_lyrics_provider_genius_description));
            } else if (iOrdinal == 2) {
                c8195l = new C8195l(Integer.valueOf(R.string.settings_integrations_lyrics_provider_musixmatch), Integer.valueOf(R.string.settings_integrations_lyrics_provider_musixmatch_description));
            } else {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return null;
                }
                c8195l = new C8195l(Integer.valueOf(R.string.settings_integrations_lyrics_provider_lrclib), Integer.valueOf(R.string.settings_integrations_lyrics_provider_lrclib_description));
            }
            int iIntValue3 = ((Number) c8195l.f17098l).intValue();
            int iIntValue4 = ((Number) c8195l.f17097l).intValue();
            AbstractC12953l.admob(c7091l, this.f31133l, c18233l.f35744l.name(), null, true, null, AbstractC14566l.amazon(-1392719179, new C8174l(c18233l, c7091l, this.f31132l, iIntValue3, this.f31136l, iIntValue4, this.f31135l, this.f31137l), c6956l), c6956l, (i & 14) | 1597440, 20);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
