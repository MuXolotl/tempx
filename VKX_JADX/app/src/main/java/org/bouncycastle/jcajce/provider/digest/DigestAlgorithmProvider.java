package org.bouncycastle.jcajce.provider.digest;

import defpackage.AbstractC11043l;
import defpackage.AbstractC14814l;
import defpackage.Cfor;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes3.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strStartapp = AbstractC14814l.startapp("HMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(strStartapp), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strStartapp);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strStartapp);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(strStartapp), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strStartapp);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strStartapp);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, Cfor cfor) {
        String strStartapp = AbstractC14814l.startapp("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + cfor, strStartapp);
        AbstractC11043l.metrica(new StringBuilder("Alg.Alias.KeyGenerator."), cfor, configurableProvider, strStartapp);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strStartapp = AbstractC14814l.startapp("KMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(strStartapp), str2);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(strStartapp), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strStartapp);
    }
}
