package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٍّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9506l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14569l f19397l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19398l;

    public /* synthetic */ C9506l(AbstractC14569l abstractC14569l, int i) {
        this.f19398l = i;
        this.f19397l = abstractC14569l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC8605l interfaceC8605l;
        int i = this.f19398l;
        AbstractC14569l abstractC14569l = this.f19397l;
        switch (i) {
            case 0:
                InterfaceC2186l interfaceC2186l = (InterfaceC2186l) AbstractC13402l.loadAd(abstractC14569l, AbstractC14631l.yandex);
                if (!(interfaceC2186l instanceof InterfaceC2186l)) {
                    AbstractC14825l.yandex("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC2186l);
                }
                InterfaceC2186l interfaceC2186l2 = abstractC14569l.f28523l;
                InterfaceC2186l interfaceC2186l3 = interfaceC2186l;
                abstractC14569l.f28523l = interfaceC2186l3;
                if (interfaceC2186l2 != null && !AbstractC8576l.yandex(interfaceC2186l3, interfaceC2186l2) && ((interfaceC8605l = abstractC14569l.f28522l) != null || !abstractC14569l.f28517l)) {
                    if (interfaceC8605l != null) {
                        abstractC14569l.m3073l(interfaceC8605l);
                    }
                    abstractC14569l.f28522l = null;
                    abstractC14569l.m3868l();
                }
                return Unit.INSTANCE;
            default:
                abstractC14569l.m3864l();
                return Boolean.TRUE;
        }
    }
}
